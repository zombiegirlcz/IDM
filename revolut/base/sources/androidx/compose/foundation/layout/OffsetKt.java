package androidx.compose.foundation.layout;

import a31.k;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/Dp;", "x", "y", "offset-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "offset", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/IntOffset;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation-layout"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class OffsetKt {
    @NotNull
    public static final Modifier offset(@NotNull Modifier modifier, @NotNull Function1<? super Density, IntOffset> function1) {
        return modifier.then(new OffsetPxElement(function1, true, new k(17, function1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit offset$lambda$0(Function1 function1, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("offset");
        inspectorInfo.getProperties().set("offset", function1);
        return Unit.f186387a;
    }

    @NotNull
    /* JADX INFO: renamed from: offset-VpY3zN4, reason: not valid java name */
    public static final Modifier m854offsetVpY3zN4(@NotNull Modifier modifier, float f, float f4) {
        return modifier.then(new OffsetElement(f, f4, true, new i1.f(f, f4, 0), null));
    }

    /* JADX INFO: renamed from: offset-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m855offsetVpY3zN4$default(Modifier modifier, float f, float f4, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = Dp.m3297constructorimpl(0);
        }
        if ((i & 2) != 0) {
            f4 = Dp.m3297constructorimpl(0);
        }
        return m854offsetVpY3zN4(modifier, f, f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit offset_VpY3zN4$lambda$0(float f, float f4, InspectorInfo inspectorInfo) {
        inspectorInfo.setName("offset");
        com.revolut.data.database.models.openbanking.d.h(f, inspectorInfo.getProperties(), "x", inspectorInfo).set("y", Dp.m3295boximpl(f4));
        return Unit.f186387a;
    }
}
