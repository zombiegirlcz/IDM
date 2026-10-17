package j1;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier f170064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LazyListState f170065c;
    public final /* synthetic */ PaddingValues d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ FlingBehavior f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f170066g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ OverscrollEffect f170067h;
    public final /* synthetic */ Function1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f170068j;
    public final /* synthetic */ int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f170069l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f170070m;

    public /* synthetic */ a(Modifier modifier, LazyListState lazyListState, PaddingValues paddingValues, boolean z, Object obj2, Object obj3, FlingBehavior flingBehavior, boolean z3, OverscrollEffect overscrollEffect, Function1 function1, int i, int i2, int i3) {
        this.f170063a = i3;
        this.f170064b = modifier;
        this.f170065c = lazyListState;
        this.d = paddingValues;
        this.e = z;
        this.f170069l = obj2;
        this.f170070m = obj3;
        this.f = flingBehavior;
        this.f170066g = z3;
        this.f170067h = overscrollEffect;
        this.i = function1;
        this.f170068j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f170063a) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return LazyDslKt.LazyRow$lambda$0(this.f170064b, this.f170065c, this.d, this.e, (Arrangement.Horizontal) this.f170069l, (Alignment.Vertical) this.f170070m, this.f, this.f170066g, this.f170067h, this.i, this.f170068j, this.k, (Composer) obj2, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj3).intValue();
                return LazyDslKt.LazyColumn$lambda$0(this.f170064b, this.f170065c, this.d, this.e, (Arrangement.Vertical) this.f170069l, (Alignment.Horizontal) this.f170070m, this.f, this.f170066g, this.f170067h, this.i, this.f170068j, this.k, (Composer) obj2, iIntValue2);
        }
    }
}
