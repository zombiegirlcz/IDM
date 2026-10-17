package aii;

import com.revolut.kompot.common.ActionBreadcrumb;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f5287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5288c;
    public final ActionBreadcrumb d;

    public /* synthetic */ i(Throwable th10, a aVar, int i) {
        this(th10, (i & 2) != 0 ? a.UNKNOWN : aVar, new ActionBreadcrumb());
    }

    public static i b(i iVar, Throwable throwable) {
        a actionContext = iVar.f5288c;
        ActionBreadcrumb actionBreadcrumb = iVar.d;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(actionContext, "actionContext");
        Intrinsics.checkNotNullParameter(actionBreadcrumb, "actionBreadcrumb");
        return new i(throwable, actionContext, actionBreadcrumb);
    }

    public final Throwable c() {
        return this.f5287b;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f5287b, iVar.f5287b) && this.f5288c == iVar.f5288c;
    }

    public final int hashCode() {
        return this.f5288c.hashCode() + (this.f5287b.hashCode() * 31);
    }

    public i(Throwable throwable, a actionContext, ActionBreadcrumb actionBreadcrumb) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(actionContext, "actionContext");
        Intrinsics.checkNotNullParameter(actionBreadcrumb, "actionBreadcrumb");
        this.f5287b = throwable;
        this.f5288c = actionContext;
        this.d = actionBreadcrumb;
    }
}
