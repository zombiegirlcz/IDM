package u70;

import com.revolut.core.error.data.model.ServerErrorException;
import d9.e1;
import elm.f;
import ie.p;
import ie.r;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import rch.o;
import skm.e0;
import skm.p0;
import u4e.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends gom.d implements e0m.d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object f277701r = new Object();
    public final boolean e;
    public final sh0.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f277702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f277703h;
    public final i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f277704j;
    public final sf0.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a90.a f277705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CoroutineScope f277706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f277707n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f277708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f277709q;

    public c(sh0.a crashlytics, vo8.b deviceIdProvider, sf0.c loggableThrowableMapper, a90.a currentProcessInfoProvider) {
        i onExceptionRecorded = new i(21);
        i shouldRecordException = new i(22);
        CoroutineScope coroutineScope = rd0.e.a(p0.f264002b);
        Intrinsics.checkNotNullParameter(crashlytics, "crashlytics");
        Intrinsics.checkNotNullParameter("Revolut", "defaultLogTag");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        Intrinsics.checkNotNullParameter(onExceptionRecorded, "onExceptionRecorded");
        Intrinsics.checkNotNullParameter(shouldRecordException, "shouldRecordException");
        Intrinsics.checkNotNullParameter(loggableThrowableMapper, "loggableThrowableMapper");
        Intrinsics.checkNotNullParameter(currentProcessInfoProvider, "currentProcessInfoProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        e uncaughtExceptionHandlerAccessor = e.f277711a;
        Intrinsics.checkNotNullParameter(uncaughtExceptionHandlerAccessor, "uncaughtExceptionHandlerAccessor");
        this.e = true;
        this.f = crashlytics;
        this.f277702g = "Revolut";
        this.f277703h = deviceIdProvider;
        this.i = onExceptionRecorded;
        this.f277704j = shouldRecordException;
        this.k = loggableThrowableMapper;
        this.f277705l = currentProcessInfoProvider;
        this.f277706m = coroutineScope;
        this.f277707n = uncaughtExceptionHandlerAccessor;
        this.f277708p = new LinkedHashSet();
        this.f277709q = new Object();
    }

    public final void b(Throwable th10) {
        String strL;
        StackTraceElement[] stackTrace = th10.getStackTrace();
        if (stackTrace == null) {
            stackTrace = new StackTraceElement[0];
        }
        StackTraceElement stackTraceElement = (StackTraceElement) kotlin.collections.d.P(stackTrace);
        if (stackTraceElement == null) {
            return;
        }
        boolean z = th10 instanceof ServerErrorException;
        sh0.a aVar = this.f;
        if (z) {
            String strA = b.FILE_NAME_CUSTOM_KEY.a();
            t0 t0Var = t0.f186434a;
            m70.a.c(t0Var);
            aVar.b(strA, "");
            String strA2 = b.FUNCTION_NAME_CUSTOM_KEY.a();
            Intrinsics.checkNotNullParameter(t0Var, "<this>");
            aVar.b(strA2, "");
            String strA3 = b.URL_PATH_CUSTOM_KEY.a();
            ServerErrorException serverErrorException = (ServerErrorException) th10;
            String str = serverErrorException.f51365a;
            String strConcat = (str == null || (strL = m70.a.l(str)) == null) ? null : strL.concat(" ");
            if (strConcat == null) {
                strConcat = "";
            }
            String str2 = serverErrorException.f51369h;
            if (str2 == null) {
                str2 = "";
            }
            aVar.b(strA3, strConcat.concat(str2));
            aVar.b(b.HTTP_STATUS_CODE_CUSTOM_KEY.a(), String.valueOf(serverErrorException.e));
            String strA4 = b.REQUEST_ID_CUSTOM_KEY.a();
            String str3 = serverErrorException.d;
            if (str3 == null) {
                str3 = "";
            }
            aVar.b(strA4, str3);
        } else {
            String strA5 = b.FILE_NAME_CUSTOM_KEY.a();
            String fileName = stackTraceElement.getFileName();
            if (fileName == null) {
                fileName = "";
            }
            aVar.b(strA5, fileName);
            String strA6 = b.FUNCTION_NAME_CUSTOM_KEY.a();
            String methodName = stackTraceElement.getMethodName();
            if (methodName == null) {
                methodName = "";
            }
            aVar.b(strA6, methodName);
        }
        String strA7 = b.ERROR_MESSAGE_CUSTOM_KEY.a();
        String message = th10.getMessage();
        aVar.b(strA7, message != null ? message : "");
    }

    public final void c(int i, String str, String str2, Throwable th10, Set set) {
        String str3;
        String[] elements = {str2, th10 != null ? th10.getMessage() : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        String message = m70.a.l(d0.k0(kotlin.collections.d.L(elements), " ", null, null, 0, null, 62));
        if (message != null) {
            sh0.a aVar = this.f;
            if (str == null) {
                str = this.f277702g;
            }
            Intrinsics.checkNotNullParameter(message, "message");
            switch (i) {
                case 2:
                    str3 = "V/";
                    break;
                case 3:
                    str3 = "D/";
                    break;
                case 4:
                    str3 = "I/";
                    break;
                case 5:
                    str3 = "W/";
                    break;
                case 6:
                    str3 = "E/";
                    break;
                case 7:
                    str3 = "A/";
                    break;
                default:
                    throw new IllegalStateException(a0.d.n("unknown log level ", i));
            }
            if (str == null) {
                str = "";
            }
            String message2 = str3 + str + ": " + message;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(message2, "message");
            r rVar = ee.c.a().f125046a;
            rVar.o.f173167a.b(new p(rVar, System.currentTimeMillis() - rVar.d, message2));
        }
        if (i == 6) {
            if (th10 == null) {
                if (str2 == null) {
                    str2 = "";
                }
                th10 = new IllegalStateException(str2);
                StackTraceElement[] stackTrace = th10.getStackTrace();
                Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
                ArrayList arrayList = new ArrayList();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!Intrinsics.f(stackTraceElement.getClassName(), c.class.getName()) && !Intrinsics.f(stackTraceElement.getClassName(), rd0.d.class.getName())) {
                        arrayList.add(stackTraceElement);
                    }
                }
                th10.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            }
            Throwable throwable = ((sf0.e) this.k).a(th10);
            this.f277704j.invoke(throwable);
            if (Boolean.TRUE.booleanValue()) {
                synchronized (this.f277709q) {
                    try {
                        LinkedHashSet linkedHashSet = this.f277708p;
                        Iterator it8 = linkedHashSet.iterator();
                        while (it8.hasNext()) {
                            this.f.b((String) ((Pair) it8.next()).f186385a, "");
                        }
                        linkedHashSet.clear();
                        for (b bVar : b.values()) {
                            sh0.a aVar2 = this.f;
                            String strA = bVar.a();
                            m70.a.c(t0.f186434a);
                            aVar2.b(strA, "");
                        }
                        LinkedHashSet<Pair> linkedHashSet2 = this.f277708p;
                        linkedHashSet2.addAll(set);
                        for (Pair pair : linkedHashSet2) {
                            this.f.b((String) pair.f186385a, (String) pair.f186386b);
                        }
                        b(th10);
                        LinkedHashMap linkedHashMapD = e1.d(th10);
                        if (linkedHashMapD.isEmpty()) {
                            this.f.getClass();
                            Intrinsics.checkNotNullParameter(throwable, "throwable");
                            ee.c cVarA = ee.c.a();
                            if (throwable != null) {
                                r rVar2 = cVarA.f125046a;
                                rVar2.o.f173167a.b(new b0.d(rVar2, 9, throwable, Collections.EMPTY_MAP));
                            }
                        } else {
                            this.f.a(throwable, linkedHashMapD);
                        }
                        Unit unit = Unit.f186387a;
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
                this.i.invoke(throwable);
            }
        }
    }

    @Override // e0m.d
    public final void init() {
        if (this.e) {
            synchronized (f277701r) {
                try {
                    Thread.UncaughtExceptionHandler uncaughtExceptionHandlerA = this.f277707n.a();
                    if (uncaughtExceptionHandlerA != null && !(uncaughtExceptionHandlerA instanceof rd0.b)) {
                        this.f277707n.b(new rd0.b(new o(this.f), uncaughtExceptionHandlerA));
                    }
                    Unit unit = Unit.f186387a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        }
        CoroutineScope coroutineScope = this.f277706m;
        p0 p0Var = p0.f264001a;
        e0.C(coroutineScope, f.f127540b, null, new u07.b(this, null, 12), 2);
    }

    @Override // gom.d
    public final boolean isLoggable(String str, int i) {
        return this.e && i > 4;
    }

    @Override // gom.d
    public final void log(int i, String str, String message, Throwable th10) {
        Intrinsics.checkNotNullParameter(message, "message");
        c(i, str, message, th10, h0.f322473a);
    }
}
