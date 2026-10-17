package com.revolut.feature.alipay_plus.mpm.webcontainer;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerEvent;", "", "action", "", "presenter", "Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "params", "", "<init>", "(Ljava/lang/String;Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;Ljava/util/Map;)V", "getAction", "()Ljava/lang/String;", "getPresenter", "()Lcom/revolut/feature/alipay_plus/mpm/webcontainer/APMPMContainerPresenter;", "getParams", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature_alipay_plus_nonsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class APMPMContainerEvent {

    @NotNull
    private final String action;

    @NotNull
    private final Map<String, Object> params;

    @NotNull
    private final APMPMContainerPresenter presenter;

    @NotNull
    public static final String ACTION_SHOULD_OVERRIDE_URL = "h5PageShouldLoadUrl";

    @NotNull
    public static final String PARAM_URL = "url";

    public APMPMContainerEvent(@NotNull String action, @NotNull APMPMContainerPresenter presenter, @NotNull Map<String, Object> params) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(params, "params");
        this.action = action;
        this.presenter = presenter;
        this.params = params;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APMPMContainerEvent copy$default(APMPMContainerEvent aPMPMContainerEvent, String str, APMPMContainerPresenter aPMPMContainerPresenter, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = aPMPMContainerEvent.action;
        }
        if ((i & 2) != 0) {
            aPMPMContainerPresenter = aPMPMContainerEvent.presenter;
        }
        if ((i & 4) != 0) {
            map = aPMPMContainerEvent.params;
        }
        return aPMPMContainerEvent.copy(str, aPMPMContainerPresenter, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final APMPMContainerPresenter getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final Map<String, Object> component3() {
        return this.params;
    }

    @NotNull
    public final APMPMContainerEvent copy(@NotNull String action, @NotNull APMPMContainerPresenter presenter, @NotNull Map<String, Object> params) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(params, "params");
        return new APMPMContainerEvent(action, presenter, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APMPMContainerEvent)) {
            return false;
        }
        APMPMContainerEvent aPMPMContainerEvent = (APMPMContainerEvent) other;
        return Intrinsics.f(this.action, aPMPMContainerEvent.action) && Intrinsics.f(this.presenter, aPMPMContainerEvent.presenter) && Intrinsics.f(this.params, aPMPMContainerEvent.params);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @NotNull
    public final APMPMContainerPresenter getPresenter() {
        return this.presenter;
    }

    public int hashCode() {
        return this.params.hashCode() + ((this.presenter.hashCode() + (this.action.hashCode() * 31)) * 31);
    }

    public /* synthetic */ APMPMContainerEvent(String str, APMPMContainerPresenter aPMPMContainerPresenter, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aPMPMContainerPresenter, (i & 4) != 0 ? new LinkedHashMap() : map);
    }
}
