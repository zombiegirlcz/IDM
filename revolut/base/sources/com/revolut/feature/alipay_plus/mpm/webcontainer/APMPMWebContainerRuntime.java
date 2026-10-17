package com.revolut.feature.alipay_plus.mpm.webcontainer;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import zhm.a0;
import zhm.b0;
import zhm.u0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\tJ\"\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0010J\u001a\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\fH\u0000¢\u0006\u0002\b J\u0015\u0010!\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\"H\u0000¢\u0006\u0002\b#J\u0015\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b(R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerRuntime;", "", "<init>", "()V", "jsBridge", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSBridge;", "getJsBridge$feature_alipay_plus_nonsdk_release", "()Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMJSBridge;", "launcher", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerLauncher;", "containerPlugins", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPlugin;", "listeners", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerListener;", "registerLauncher", "", "containerLauncher", "startContainer", "context", "Landroid/content/Context;", "params", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMWebContainerParams;", "listener", "notifyDestroyed", "pageId", "bundle", "Landroid/os/Bundle;", "registerPlugin", "plugin", "registerPlugin$feature_alipay_plus_nonsdk_release", "registerJSPlugin", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMBaseJSPlugin;", "registerJSPlugin$feature_alipay_plus_nonsdk_release", "dispatch", "", "event", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerEvent;", "dispatch$feature_alipay_plus_nonsdk_release", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class APMPMWebContainerRuntime {
    private static volatile APMPMWebContainerLauncher launcher;

    @NotNull
    public static final APMPMWebContainerRuntime INSTANCE = new APMPMWebContainerRuntime();

    @NotNull
    private static final APMPMJSBridge jsBridge = new APMPMJSBridge();

    @NotNull
    private static final CopyOnWriteArrayList<APMPMContainerPlugin> containerPlugins = new CopyOnWriteArrayList<>();

    @NotNull
    private static final ConcurrentHashMap<String, APMPMWebContainerListener> listeners = new ConcurrentHashMap<>();

    private APMPMWebContainerRuntime() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean registerPlugin$lambda$0(APMPMContainerPlugin aPMPMContainerPlugin, APMPMContainerPlugin aPMPMContainerPlugin2) {
        return aPMPMContainerPlugin2.getClass() == aPMPMContainerPlugin.getClass();
    }

    public static /* synthetic */ void startContainer$default(APMPMWebContainerRuntime aPMPMWebContainerRuntime, Context context, APMPMWebContainerParams aPMPMWebContainerParams, APMPMWebContainerListener aPMPMWebContainerListener, int i, Object obj2) {
        if ((i & 4) != 0) {
            aPMPMWebContainerListener = null;
        }
        aPMPMWebContainerRuntime.startContainer(context, aPMPMWebContainerParams, aPMPMWebContainerListener);
    }

    public final boolean dispatch$feature_alipay_plus_nonsdk_release(@NotNull APMPMContainerEvent event) {
        boolean z;
        Intrinsics.checkNotNullParameter(event, "event");
        CopyOnWriteArrayList<APMPMContainerPlugin> copyOnWriteArrayList = containerPlugins;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : copyOnWriteArrayList) {
            if (((APMPMContainerPlugin) obj2).actions().contains(event.getAction())) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        loop1: while (true) {
            while (it8.hasNext()) {
                z = ((APMPMContainerPlugin) it8.next()).handleEvent(event) || z;
            }
        }
        Iterator it9 = b0.M(containerPlugins).iterator();
        while (true) {
            ListIterator listIterator = ((u0) it9).f322480a;
            if (!listIterator.hasPrevious()) {
                return z;
            }
            APMPMContainerPlugin aPMPMContainerPlugin = (APMPMContainerPlugin) listIterator.previous();
            if (aPMPMContainerPlugin.actions().contains(event.getAction()) && aPMPMContainerPlugin.interceptEvent(event)) {
                return true;
            }
        }
    }

    @NotNull
    public final APMPMJSBridge getJsBridge$feature_alipay_plus_nonsdk_release() {
        return jsBridge;
    }

    public final void notifyDestroyed(String pageId, Bundle bundle) {
        APMPMWebContainerListener aPMPMWebContainerListenerRemove;
        if (pageId == null || d0.W(pageId) || bundle == null || (aPMPMWebContainerListenerRemove = listeners.remove(pageId)) == null) {
            return;
        }
        aPMPMWebContainerListenerRemove.onContainerDestroyed(bundle);
    }

    public final void registerJSPlugin$feature_alipay_plus_nonsdk_release(@NotNull APMPMBaseJSPlugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        jsBridge.registerJSPlugin(plugin);
    }

    public final void registerLauncher(@NotNull APMPMWebContainerLauncher containerLauncher) {
        Intrinsics.checkNotNullParameter(containerLauncher, "containerLauncher");
        launcher = containerLauncher;
    }

    public final void registerPlugin$feature_alipay_plus_nonsdk_release(@NotNull APMPMContainerPlugin plugin) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        CopyOnWriteArrayList<APMPMContainerPlugin> copyOnWriteArrayList = containerPlugins;
        a0.E(copyOnWriteArrayList, new ce9.a(plugin, 29));
        copyOnWriteArrayList.add(plugin);
    }

    public final void startContainer(@NotNull Context context, @NotNull APMPMWebContainerParams params, APMPMWebContainerListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        if (d0.W(params.getUrl())) {
            return;
        }
        String str = params.getUrl().hashCode() + "_" + System.currentTimeMillis();
        if (listener != null) {
            listeners.put(str, listener);
        }
        APMPMWebContainerLauncher aPMPMWebContainerLauncher = launcher;
        if (aPMPMWebContainerLauncher == null) {
            listeners.remove(str);
            throw new IllegalStateException("APMPMWebContainerLauncher is not registered");
        }
        try {
            aPMPMWebContainerLauncher.launch(context, params, str);
        } catch (Throwable th10) {
            listeners.remove(str);
            throw th10;
        }
    }
}
