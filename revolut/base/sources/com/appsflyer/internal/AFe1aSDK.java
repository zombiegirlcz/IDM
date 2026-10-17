package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1aSDK {
    public Executor AFInAppEventParameterName;
    final Timer AFInAppEventType;
    final ExecutorService AFKeystoreWrapper;
    final NavigableSet<AFf1xSDK<?>> AFLogger;
    final NavigableSet<AFf1xSDK<?>> d;
    final List<AFf1xSDK<?>> e;
    final Set<AFf1ySDK> registerClient;
    final Set<AFf1xSDK<?>> unregisterClient;
    final Set<AFf1ySDK> valueOf;
    public final List<AFe1eSDK> values;

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1aSDK$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (AFe1aSDK.this.d) {
                try {
                    final AFf1xSDK<?> aFf1xSDKPollFirst = AFe1aSDK.this.d.pollFirst();
                    if (aFf1xSDKPollFirst == null) {
                        return;
                    }
                    AFe1aSDK.this.unregisterClient.add(aFf1xSDKPollFirst);
                    long jValueOf = aFf1xSDKPollFirst.valueOf();
                    AFf1wSDK aFf1wSDK = new AFf1wSDK(Thread.currentThread());
                    if (jValueOf > 0) {
                        AFe1aSDK.this.AFInAppEventType.schedule(aFf1wSDK, jValueOf);
                    }
                    final AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                    aFe1aSDK.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Iterator<AFe1eSDK> it8 = AFe1aSDK.this.values.iterator();
                            while (it8.hasNext()) {
                                it8.next().AFKeystoreWrapper(aFf1xSDKPollFirst);
                            }
                        }
                    });
                    if (!AFe1aSDK.this.d.isEmpty()) {
                        AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                        aFe1aSDK2.AFKeystoreWrapper.submit(aFe1aSDK2.new AnonymousClass3());
                    }
                    try {
                        AFLogger.INSTANCE.d(AFg1bSDK.QUEUE, "starting task execution: ".concat(String.valueOf(aFf1xSDKPollFirst)));
                        final AFe1fSDK aFe1fSDKCall = aFf1xSDKPollFirst.call();
                        aFf1wSDK.cancel();
                        final AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                        aFe1aSDK3.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1bSDK aFg1bSDK = AFg1bSDK.QUEUE;
                                StringBuilder sb6 = new StringBuilder("execution finished for ");
                                sb6.append(aFf1xSDKPollFirst);
                                sb6.append(", result: ");
                                sb6.append(aFe1fSDKCall);
                                aFLogger.d(aFg1bSDK, sb6.toString());
                                AFe1aSDK.this.unregisterClient.remove(aFf1xSDKPollFirst);
                                Iterator<AFe1eSDK> it8 = AFe1aSDK.this.values.iterator();
                                while (it8.hasNext()) {
                                    it8.next().AFKeystoreWrapper(aFf1xSDKPollFirst, aFe1fSDKCall);
                                }
                                if (aFe1fSDKCall == AFe1fSDK.SUCCESS) {
                                    AFe1aSDK.this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
                                    AFe1aSDK.AFInAppEventParameterName(AFe1aSDK.this);
                                    return;
                                }
                                if (!aFf1xSDKPollFirst.values()) {
                                    AFe1aSDK.this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
                                    AFe1aSDK.AFInAppEventParameterName(AFe1aSDK.this);
                                } else if (AFe1aSDK.AFInAppEventParameterName((AFf1xSDK<?>) aFf1xSDKPollFirst)) {
                                    synchronized (AFe1aSDK.this.d) {
                                        try {
                                            AFe1aSDK.this.e.add(aFf1xSDKPollFirst);
                                            for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.values) {
                                            }
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (InterruptedIOException | InterruptedException unused) {
                        AFLogger.INSTANCE.d(AFg1bSDK.QUEUE, "task was interrupted: ".concat(String.valueOf(aFf1xSDKPollFirst)));
                        final AFe1fSDK aFe1fSDK = AFe1fSDK.TIMEOUT;
                        aFf1xSDKPollFirst.values = aFe1fSDK;
                        final AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                        aFe1aSDK4.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1bSDK aFg1bSDK = AFg1bSDK.QUEUE;
                                StringBuilder sb6 = new StringBuilder("execution finished for ");
                                sb6.append(aFf1xSDKPollFirst);
                                sb6.append(", result: ");
                                sb6.append(aFe1fSDK);
                                aFLogger.d(aFg1bSDK, sb6.toString());
                                AFe1aSDK.this.unregisterClient.remove(aFf1xSDKPollFirst);
                                Iterator<AFe1eSDK> it8 = AFe1aSDK.this.values.iterator();
                                while (it8.hasNext()) {
                                    it8.next().AFKeystoreWrapper(aFf1xSDKPollFirst, aFe1fSDK);
                                }
                                if (aFe1fSDK == AFe1fSDK.SUCCESS) {
                                    AFe1aSDK.this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
                                    AFe1aSDK.AFInAppEventParameterName(AFe1aSDK.this);
                                    return;
                                }
                                if (!aFf1xSDKPollFirst.values()) {
                                    AFe1aSDK.this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
                                    AFe1aSDK.AFInAppEventParameterName(AFe1aSDK.this);
                                } else if (AFe1aSDK.AFInAppEventParameterName((AFf1xSDK<?>) aFf1xSDKPollFirst)) {
                                    synchronized (AFe1aSDK.this.d) {
                                        try {
                                            AFe1aSDK.this.e.add(aFf1xSDKPollFirst);
                                            for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.values) {
                                            }
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                    }
                                }
                            }
                        });
                    } catch (Throwable unused2) {
                        aFf1wSDK.cancel();
                        final AFe1aSDK aFe1aSDK5 = AFe1aSDK.this;
                        final AFe1fSDK aFe1fSDK2 = AFe1fSDK.FAILURE;
                        aFe1aSDK5.AFInAppEventParameterName.execute(new Runnable() { // from class: com.appsflyer.internal.AFe1aSDK.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1bSDK aFg1bSDK = AFg1bSDK.QUEUE;
                                StringBuilder sb6 = new StringBuilder("execution finished for ");
                                sb6.append(aFf1xSDKPollFirst);
                                sb6.append(", result: ");
                                sb6.append(aFe1fSDK2);
                                aFLogger.d(aFg1bSDK, sb6.toString());
                                AFe1aSDK.this.unregisterClient.remove(aFf1xSDKPollFirst);
                                Iterator<AFe1eSDK> it8 = AFe1aSDK.this.values.iterator();
                                while (it8.hasNext()) {
                                    it8.next().AFKeystoreWrapper(aFf1xSDKPollFirst, aFe1fSDK2);
                                }
                                if (aFe1fSDK2 == AFe1fSDK.SUCCESS) {
                                    AFe1aSDK.this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
                                    AFe1aSDK.AFInAppEventParameterName(AFe1aSDK.this);
                                    return;
                                }
                                if (!aFf1xSDKPollFirst.values()) {
                                    AFe1aSDK.this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
                                    AFe1aSDK.AFInAppEventParameterName(AFe1aSDK.this);
                                } else if (AFe1aSDK.AFInAppEventParameterName((AFf1xSDK<?>) aFf1xSDKPollFirst)) {
                                    synchronized (AFe1aSDK.this.d) {
                                        try {
                                            AFe1aSDK.this.e.add(aFf1xSDKPollFirst);
                                            for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.values) {
                                            }
                                        } catch (Throwable th10) {
                                            throw th10;
                                        }
                                    }
                                }
                            }
                        });
                    }
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFe1aSDK$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {
        private /* synthetic */ AFf1xSDK AFInAppEventType;

        public AnonymousClass4(AFf1xSDK aFf1xSDK) {
            this.AFInAppEventType = aFf1xSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zAdd;
            synchronized (AFe1aSDK.this.d) {
                try {
                    if (AFe1aSDK.this.unregisterClient.contains(this.AFInAppEventType)) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        AFg1bSDK aFg1bSDK = AFg1bSDK.QUEUE;
                        StringBuilder sb6 = new StringBuilder("tried to add already running task: ");
                        sb6.append(this.AFInAppEventType);
                        aFLogger.d(aFg1bSDK, sb6.toString());
                        return;
                    }
                    if (!AFe1aSDK.this.d.contains(this.AFInAppEventType) && !AFe1aSDK.this.AFLogger.contains(this.AFInAppEventType)) {
                        AFe1aSDK aFe1aSDK = AFe1aSDK.this;
                        AFf1xSDK aFf1xSDK = this.AFInAppEventType;
                        for (AFf1ySDK aFf1ySDK : aFf1xSDK.valueOf) {
                            if (aFe1aSDK.registerClient.contains(aFf1ySDK)) {
                                aFf1xSDK.AFInAppEventParameterName.add(aFf1ySDK);
                            }
                        }
                        if (AFe1aSDK.this.valueOf(this.AFInAppEventType)) {
                            zAdd = AFe1aSDK.this.d.add(this.AFInAppEventType);
                        } else {
                            zAdd = AFe1aSDK.this.AFLogger.add(this.AFInAppEventType);
                            if (zAdd) {
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                AFg1bSDK aFg1bSDK2 = AFg1bSDK.QUEUE;
                                StringBuilder sb9 = new StringBuilder("new task was blocked: ");
                                sb9.append(this.AFInAppEventType);
                                aFLogger2.d(aFg1bSDK2, sb9.toString());
                                this.AFInAppEventType.AFKeystoreWrapper();
                            }
                        }
                        if (zAdd) {
                            AFe1aSDK aFe1aSDK2 = AFe1aSDK.this;
                            aFe1aSDK2.d.addAll(aFe1aSDK2.e);
                            AFe1aSDK.this.e.clear();
                        } else {
                            AFLogger aFLogger3 = AFLogger.INSTANCE;
                            AFg1bSDK aFg1bSDK3 = AFg1bSDK.QUEUE;
                            StringBuilder sb10 = new StringBuilder("task not added, it's already in the queue: ");
                            sb10.append(this.AFInAppEventType);
                            aFLogger3.d(aFg1bSDK3, sb10.toString());
                        }
                        if (!zAdd) {
                            AFLogger aFLogger4 = AFLogger.INSTANCE;
                            AFg1bSDK aFg1bSDK4 = AFg1bSDK.QUEUE;
                            StringBuilder sb11 = new StringBuilder("QUEUE: tried to add already pending task: ");
                            sb11.append(this.AFInAppEventType);
                            aFLogger4.w(aFg1bSDK4, sb11.toString());
                            return;
                        }
                        AFe1aSDK.this.registerClient.add(this.AFInAppEventType.AFKeystoreWrapper);
                        AFLogger aFLogger5 = AFLogger.INSTANCE;
                        AFg1bSDK aFg1bSDK5 = AFg1bSDK.QUEUE;
                        StringBuilder sb12 = new StringBuilder("new task added: ");
                        sb12.append(this.AFInAppEventType);
                        aFLogger5.d(aFg1bSDK5, sb12.toString());
                        for (AFe1eSDK aFe1eSDK : AFe1aSDK.this.values) {
                        }
                        AFe1aSDK aFe1aSDK3 = AFe1aSDK.this;
                        aFe1aSDK3.AFKeystoreWrapper.submit(aFe1aSDK3.new AnonymousClass3());
                        AFe1aSDK aFe1aSDK4 = AFe1aSDK.this;
                        synchronized (aFe1aSDK4.d) {
                            try {
                                for (int size = (aFe1aSDK4.d.size() + aFe1aSDK4.AFLogger.size()) - 40; size > 0; size--) {
                                    boolean zIsEmpty = aFe1aSDK4.AFLogger.isEmpty();
                                    boolean zIsEmpty2 = aFe1aSDK4.d.isEmpty();
                                    if (zIsEmpty2 || zIsEmpty) {
                                        if (!zIsEmpty2) {
                                            aFe1aSDK4.AFInAppEventType(aFe1aSDK4.d);
                                        } else if (!zIsEmpty) {
                                            aFe1aSDK4.AFInAppEventType(aFe1aSDK4.AFLogger);
                                        }
                                    } else if (aFe1aSDK4.d.first().compareTo(aFe1aSDK4.AFLogger.first()) > 0) {
                                        aFe1aSDK4.AFInAppEventType(aFe1aSDK4.d);
                                    } else {
                                        aFe1aSDK4.AFInAppEventType(aFe1aSDK4.AFLogger);
                                    }
                                }
                            } catch (Throwable th10) {
                                throw th10;
                            }
                        }
                        return;
                    }
                    AFLogger aFLogger6 = AFLogger.INSTANCE;
                    AFg1bSDK aFg1bSDK6 = AFg1bSDK.QUEUE;
                    StringBuilder sb13 = new StringBuilder("tried to add already scheduled task: ");
                    sb13.append(this.AFInAppEventType);
                    aFLogger6.d(aFg1bSDK6, sb13.toString());
                } catch (Throwable th11) {
                    throw th11;
                }
            }
        }
    }

    public AFe1aSDK(ExecutorService executorService) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(executorServiceNewSingleThreadExecutor, "");
        this.AFInAppEventParameterName = executorServiceNewSingleThreadExecutor;
        this.AFInAppEventType = new Timer(true);
        this.values = new CopyOnWriteArrayList();
        this.valueOf = new CopyOnWriteArraySet();
        this.registerClient = Collections.newSetFromMap(new ConcurrentHashMap());
        this.d = new ConcurrentSkipListSet();
        this.AFLogger = new ConcurrentSkipListSet();
        this.e = new ArrayList();
        this.unregisterClient = Collections.newSetFromMap(new ConcurrentHashMap());
        this.AFKeystoreWrapper = executorService;
    }

    public static boolean AFInAppEventParameterName(AFf1xSDK<?> aFf1xSDK) {
        return ((aFf1xSDK instanceof AFf1dSDK) && aFf1xSDK.AFKeystoreWrapper == AFf1ySDK.ARS_VALIDATE) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean valueOf(AFf1xSDK<?> aFf1xSDK) {
        return this.valueOf.containsAll(aFf1xSDK.AFInAppEventParameterName);
    }

    public final void AFInAppEventType(NavigableSet<AFf1xSDK<?>> navigableSet) {
        AFf1xSDK<?> aFf1xSDKPollFirst = navigableSet.pollFirst();
        this.valueOf.add(aFf1xSDKPollFirst.AFKeystoreWrapper);
        Iterator<AFe1eSDK> it8 = this.values.iterator();
        while (it8.hasNext()) {
            it8.next().values(aFf1xSDKPollFirst);
        }
    }

    public static /* synthetic */ void AFInAppEventParameterName(AFe1aSDK aFe1aSDK) {
        synchronized (aFe1aSDK.d) {
            try {
                Iterator<AFf1xSDK<?>> it8 = aFe1aSDK.AFLogger.iterator();
                boolean z = false;
                while (it8.hasNext()) {
                    AFf1xSDK<?> next = it8.next();
                    if (aFe1aSDK.valueOf(next)) {
                        it8.remove();
                        aFe1aSDK.d.add(next);
                        z = true;
                    }
                }
                if (z) {
                    aFe1aSDK.AFKeystoreWrapper.submit(aFe1aSDK.new AnonymousClass3());
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}
