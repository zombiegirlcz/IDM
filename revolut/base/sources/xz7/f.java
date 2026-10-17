package xz7;

import kfm.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f309872b;

    public f(int i, Function1 function) {
        this.f309871a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309872b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309872b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309872b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309872b = function;
                break;
            case 5:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309872b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f309872b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f309871a) {
            case 2:
                this.f309872b.invoke(obj2);
                break;
            default:
                this.f309872b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f309871a) {
        }
        return this.f309872b.invoke(obj2);
    }
}
