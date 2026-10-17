package yma;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h implements kfm.g, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f314915b;

    public h(int i, Function1 function) {
        this.f314914a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f314915b = function;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f314915b = function;
                break;
            case 3:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f314915b = function;
                break;
            case 4:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f314915b = function;
                break;
            default:
                Intrinsics.checkNotNullParameter(function, "function");
                this.f314915b = function;
                break;
        }
    }

    @Override // kfm.g
    public /* synthetic */ void accept(Object obj2) {
        switch (this.f314914a) {
            case 0:
                this.f314915b.invoke(obj2);
                break;
            case 1:
            case 2:
            default:
                this.f314915b.invoke(obj2);
                break;
            case 3:
                this.f314915b.invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f314914a) {
        }
        return this.f314915b.invoke(obj2);
    }
}
