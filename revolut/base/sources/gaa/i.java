package gaa;

import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;
import nii.m0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i implements nii.b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f142124b;

    /* JADX WARN: Multi-variable type inference failed */
    public i(int i, Function1 function) {
        this.f142123a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f142124b = (q) function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f142124b = (q) function;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // nii.p1
    public final /* synthetic */ m0 a(Object obj2) {
        switch (this.f142123a) {
            case 0:
                return (m0) this.f142124b.invoke((Throwable) obj2);
            default:
                return (m0) this.f142124b.invoke((Throwable) obj2);
        }
    }

    public final boolean equals(Object obj2) {
        switch (this.f142123a) {
            case 0:
                if ((obj2 instanceof nii.b) && (obj2 instanceof n)) {
                    break;
                }
                break;
            default:
                if ((obj2 instanceof nii.b) && (obj2 instanceof n)) {
                    break;
                }
                break;
        }
        return Intrinsics.f(getFunctionDelegate(), ((n) obj2).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.n
    public final Function getFunctionDelegate() {
        switch (this.f142123a) {
        }
        return this.f142124b;
    }

    public final int hashCode() {
        switch (this.f142123a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
