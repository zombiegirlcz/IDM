package au0;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import aw0.w8;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class z5 extends gim.i implements Function2 {
    public Object A;
    public Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9457w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9458x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f9459y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(WallpaperView wallpaperView, Drawable drawable, int i, int i2, w8 w8Var, Drawable drawable2, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f9459y = wallpaperView;
        this.z = drawable;
        this.f9457w = i;
        this.f9458x = i2;
        this.B = w8Var;
        this.A = drawable2;
        this.C = viewGroup;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z5((WallpaperView) this.f9459y, (Drawable) this.z, this.f9457w, this.f9458x, (w8) this.B, (Drawable) this.A, (ViewGroup) this.C, continuation);
            case 1:
                z5 z5Var = new z5((hmc.e) this.B, (String) this.C, continuation);
                z5Var.A = obj2;
                return z5Var;
            case 2:
                z5 z5Var2 = new z5((com.revolut.retail.feature.pricing_plans.waitlist.impl.ui.screen.invitation.a) this.C, continuation, 2);
                z5Var2.B = obj2;
                return z5Var2;
            case 3:
                return new z5((com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c) this.f9459y, (String) this.z, this.f9457w, (sy3.h) this.A, this.f9458x, (Integer) this.B, (Function1) this.C, continuation);
            default:
                return new z5((z20.q) this.C, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((z5) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x01a0, code lost:
    
        if (r9 != r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0102, code lost:
    
        if (r2 != r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025b  */
    /* JADX WARN: Type inference failed for: r14v1, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00cd -> B:34:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01a7 -> B:53:0x01a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x029c -> B:96:0x02a1). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au0.z5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z5(com.revolut.feature.credit.application.plugins.impl.ui.financial_situation_confirmation.c cVar, String str, int i, sy3.h hVar, int i2, Integer num, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f9459y = cVar;
        this.z = str;
        this.f9457w = i;
        this.A = hVar;
        this.f9458x = i2;
        this.B = num;
        this.C = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(hmc.e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.B = eVar;
        this.C = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z5(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.C = obj2;
    }
}
