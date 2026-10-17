package b79;

import android.graphics.drawable.Drawable;
import androidx.camera.core.Camera;
import androidx.content.NavGraphNavigator;
import cul.v;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.serialization.json.JsonElement;
import ms0.b2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f12953b;

    public /* synthetic */ i(Ref$ObjectRef ref$ObjectRef, int i) {
        this.f12952a = i;
        this.f12953b = ref$ObjectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object aVar;
        int i = this.f12952a;
        Ref$ObjectRef ref$ObjectRef = this.f12953b;
        switch (i) {
            case 0:
                s69.j params = (s69.j) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return Boolean.valueOf(((List) ref$ObjectRef.f186409a).contains(params));
            case 1:
                aii.r result = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                ref$ObjectRef.f186409a = result;
                return Unit.f186387a;
            case 2:
                v update = (v) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, (Boolean) ref$ObjectRef.f186409a, false, false, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, 8191);
            case 3:
                aii.r result2 = (aii.r) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                ref$ObjectRef.f186409a = result2;
                return Unit.f186387a;
            case 4:
                ref$ObjectRef.f186409a = (Camera) obj2;
                return Unit.f186387a;
            case 5:
                h8f.g gVar = (h8f.g) obj2;
                h8f.f fVar = (h8f.f) ((Iterator) ref$ObjectRef.f186409a).next();
                String title = gVar.f150034a;
                String str = gVar.f150035b;
                Intrinsics.checkNotNullParameter(title, "title");
                return new h8f.g(title, str, fVar);
            case 6:
                ref$ObjectRef.f186409a = (Drawable) obj2;
                return Unit.f186387a;
            case 7:
                ref$ObjectRef.f186409a = (fa1.l) obj2;
                return Unit.f186387a;
            case 8:
                int i2 = b2.o;
                ref$ObjectRef.f186409a = (Drawable) obj2;
                return Unit.f186387a;
            case 9:
                akj.c result3 = (akj.c) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                ref$ObjectRef.f186409a = result3;
                return Unit.f186387a;
            case 10:
                return Boolean.valueOf(NavGraphNavigator.navigate$lambda$6(ref$ObjectRef, (String) obj2));
            case 11:
                JsonElement it8 = (JsonElement) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ref$ObjectRef.f186409a = it8;
                return Unit.f186387a;
            case 12:
                efm.r rVarJust = efm.r.just(new Pair(ref$ObjectRef.f186409a, obj2));
                ref$ObjectRef.f186409a = obj2;
                Intrinsics.checkNotNullExpressionValue(rVarJust, "also(...)");
                return rVarJust;
            case 13:
                cp6.e result4 = (cp6.e) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                ref$ObjectRef.f186409a = result4;
                return Unit.f186387a;
            case 14:
                vni.e result5 = (vni.e) obj2;
                Intrinsics.checkNotNullParameter(result5, "result");
                if (result5 instanceof vni.c) {
                    aVar = new vnl.a(((vni.c) result5).f290815a);
                } else {
                    if (!(result5 instanceof vni.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = vnl.c.f290821a;
                }
                ref$ObjectRef.f186409a = aVar;
                return Unit.f186387a;
            case 15:
                xka.s result6 = (xka.s) obj2;
                Intrinsics.checkNotNullParameter(result6, "result");
                ref$ObjectRef.f186409a = wka.h.K2(result6);
                return Unit.f186387a;
            case 16:
                yja.b result7 = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(result7, "result");
                ref$ObjectRef.f186409a = result7;
                return Unit.f186387a;
            default:
                return (yui.l) ref$ObjectRef.f186409a;
        }
    }

    public /* synthetic */ i(Ref$ObjectRef ref$ObjectRef, wka.h hVar) {
        this.f12952a = 15;
        this.f12953b = ref$ObjectRef;
    }
}
