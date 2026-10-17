package vf0;

import java.util.function.Function;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class o implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f288463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f288464b;

    public /* synthetic */ o(int i, Function1 function1) {
        this.f288463a = i;
        this.f288464b = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj2) {
        switch (this.f288463a) {
        }
        return this.f288464b.invoke(obj2);
    }
}
