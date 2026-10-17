package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.foundation.gestures.DefaultFlingBehavior;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7002c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f7000a = i;
        this.f7001b = obj2;
        this.f7002c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f7000a) {
            case 0:
                return ContentInViewNode$launchAnimation$2.AnonymousClass1.invokeSuspend$lambda$0((ContentInViewNode) this.f7001b, (UpdatableAnimationState) this.f7002c, (Job) this.d, (NestedScrollScope) this.e, ((Float) obj2).floatValue());
            default:
                return DefaultFlingBehavior.AnonymousClass2.invokeSuspend$lambda$0((m0) this.f7001b, (ScrollScope) this.f7002c, (m0) this.d, (DefaultFlingBehavior) this.e, (AnimationScope) obj2);
        }
    }
}
