package androidx.compose.animation.core;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6987c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f6985a = i;
        this.f6986b = obj2;
        this.f6987c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f6985a) {
            case 0:
                return Animatable.AnonymousClass2.invokeSuspend$lambda$0((Animatable) this.f6986b, (AnimationState) this.f6987c, (Function1) this.d, (Ref$BooleanRef) this.e, (AnimationScope) obj2);
            default:
                return InfiniteTransition$run$1$1.invokeSuspend$lambda$0((MutableState) this.f6986b, (InfiniteTransition) this.f6987c, (m0) this.d, (CoroutineScope) this.e, ((Long) obj2).longValue());
        }
    }
}
