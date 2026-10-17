package gsh;

import java.util.function.BiConsumer;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c0 implements BiConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f146467b;

    public /* synthetic */ c0(int i, Function2 function2) {
        this.f146466a = i;
        this.f146467b = function2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj2, Object obj3) {
        switch (this.f146466a) {
            case 0:
                ((fb.c) this.f146467b).invoke(obj2, obj3);
                break;
            default:
                ((ra0.c) this.f146467b).invoke(obj2, obj3);
                break;
        }
    }
}
