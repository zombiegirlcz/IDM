package h7;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import d7.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes23.dex */
public final class k extends kotlin.jvm.internal.u implements Function2 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d7.j f149801h;
    public final /* synthetic */ Function0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Modifier f149802j;
    public final /* synthetic */ b0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ContentScale f149803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f149804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f149805n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(d7.j jVar, Function0 function0, Modifier modifier, m0 m0Var, b0 b0Var, Alignment alignment, ContentScale contentScale, d7.a aVar, int i, int i2, int i3) {
        super(2);
        this.f = i3;
        this.f149801h = jVar;
        this.i = function0;
        this.f149802j = modifier;
        this.k = b0Var;
        this.f149803l = contentScale;
        this.f149804m = i;
        this.f149805n = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.f) {
            case 0:
                ((Number) obj3).intValue();
                m.a(this.f149801h, this.i, this.f149802j, this.k, this.f149803l, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(this.f149804m | 1), RecomposeScopeImplKt.updateChangedFlags(this.f149805n));
                break;
            default:
                ((Number) obj3).intValue();
                m.a(this.f149801h, this.i, this.f149802j, this.k, this.f149803l, (Composer) obj2, RecomposeScopeImplKt.updateChangedFlags(this.f149804m | 1), RecomposeScopeImplKt.updateChangedFlags(this.f149805n));
                break;
        }
        return Unit.f186387a;
    }
}
