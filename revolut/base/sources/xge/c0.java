package xge;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import s7a.m0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c0 implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f305696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f305697b;

    public /* synthetic */ c0(int i, Function1 function1) {
        this.f305696a = i;
        this.f305697b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj2) {
        switch (this.f305696a) {
            case 0:
                return ((Boolean) ((xf0.h) this.f305697b).invoke(obj2)).booleanValue();
            case 1:
                return ((Boolean) ((xf0.h) this.f305697b).invoke(obj2)).booleanValue();
            case 2:
                return ((Boolean) ((xf0.h) this.f305697b).invoke(obj2)).booleanValue();
            case 3:
                return ((Boolean) ((m0) this.f305697b).invoke(obj2)).booleanValue();
            default:
                return ((Boolean) ((zrd.q) this.f305697b).invoke(obj2)).booleanValue();
        }
    }
}
