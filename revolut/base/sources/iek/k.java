package iek;

import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import nii.m0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class k implements nii.b, kotlin.jvm.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qek.a f160761b;

    public /* synthetic */ k(qek.a aVar, int i) {
        this.f160760a = i;
        this.f160761b = aVar;
    }

    @Override // nii.p1
    public final m0 a(Object obj2) {
        switch (this.f160760a) {
            case 0:
                Throwable p0 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return this.f160761b.c(p0);
            default:
                Throwable p03 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(p03, "p0");
                return this.f160761b.c(p03);
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f160760a) {
            case 0:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof nii.b) && (obj2 instanceof kotlin.jvm.internal.n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((kotlin.jvm.internal.n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f160760a) {
        }
        return new q(1, 0, qek.a.class, this.f160761b, "getErrorDialog", "getErrorDialog(Ljava/lang/Throwable;)Lcom/revolut/kompot/common/dialog/status/StatusDialogConfiguration;");
    }

    public final int hashCode() {
        switch (this.f160760a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
