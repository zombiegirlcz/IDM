package d0m;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.revolut.data.model.Data;
import d22.d;
import d22.e;
import d22.h;
import d27.u;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.d0;
import z0d.f;
import zhm.f0;
import zi0.c;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110449a;

    public /* synthetic */ a(int i) {
        this.f110449a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110449a) {
            case 0:
                String paramWithValue = (String) obj2;
                Regex regex = b.f110450a;
                Intrinsics.checkNotNullParameter(paramWithValue, "paramWithValue");
                List listM0 = d0.m0(paramWithValue, new char[]{'='}, 2);
                if (listM0.size() == 1) {
                    return (CharSequence) listM0.get(0);
                }
                Object obj3 = listM0.get(0);
                Object obj4 = listM0.get(1);
                String str = (String) (((String) obj4).length() == 0 ? obj4 : null);
                if (str == null) {
                    str = "[FILTERED]";
                }
                return obj3 + "=" + str;
            case 1:
                return SuspendAnimationKt.animateTo$lambda$0((AnimationScope) obj2);
            case 2:
                return SuspendAnimationKt.animateDecay$lambda$1((AnimationScope) obj2);
            case 3:
                return SuspendAnimationKt.animate$lambda$2((AnimationScope) obj2);
            case 4:
                return TransitionKt.SeekableTransitionStateTotalDurationChanged$lambda$0((SeekableTransitionState) obj2);
            case 5:
                return TransitionKt.SeekableStateObserver_delegate$lambda$0$0((Function0) obj2);
            case 6:
                return VectorConvertersKt.FloatToVector$lambda$0(((Float) obj2).floatValue());
            case 7:
                return VectorConvertersKt.IntToVector$lambda$0(((Integer) obj2).intValue());
            case 8:
                return Integer.valueOf(VectorConvertersKt.IntToVector$lambda$1((AnimationVector1D) obj2));
            case 9:
                return VectorConvertersKt.DpToVector$lambda$0((Dp) obj2);
            case 10:
                return VectorConvertersKt.DpToVector$lambda$1((AnimationVector1D) obj2);
            case 11:
                return VectorConvertersKt.DpOffsetToVector$lambda$0((DpOffset) obj2);
            case 12:
                return VectorConvertersKt.DpOffsetToVector$lambda$1((AnimationVector2D) obj2);
            case 13:
                return VectorConvertersKt.SizeToVector$lambda$0((Size) obj2);
            case 14:
                return VectorConvertersKt.SizeToVector$lambda$1((AnimationVector2D) obj2);
            case 15:
                return VectorConvertersKt.OffsetToVector$lambda$0((Offset) obj2);
            case 16:
                return VectorConvertersKt.OffsetToVector$lambda$1((AnimationVector2D) obj2);
            case 17:
                return VectorConvertersKt.IntOffsetToVector$lambda$0((IntOffset) obj2);
            case 18:
                return VectorConvertersKt.IntOffsetToVector$lambda$1((AnimationVector2D) obj2);
            case 19:
                return VectorConvertersKt.IntSizeToVector$lambda$0((IntSize) obj2);
            case 20:
                return VectorConvertersKt.IntSizeToVector$lambda$1((AnimationVector2D) obj2);
            case 21:
                return VectorConvertersKt.RectToVector$lambda$0((Rect) obj2);
            case 22:
                return VectorConvertersKt.RectToVector$lambda$1((AnimationVector4D) obj2);
            case 23:
                return Float.valueOf(((AnimationVector1D) obj2).getValue());
            case 24:
                Function0 defaultFactory = (Function0) obj2;
                Intrinsics.checkNotNullParameter(defaultFactory, "defaultFactory");
                return (List) defaultFactory.invoke();
            case 25:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return (f) zhm.d0.b0(it8);
            case 26:
                d update = (d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return d.a(update, new Data(null, null, true, 3, null));
            case 27:
                return d.a((d) obj2, c.P(null, false, null, 3));
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new e(f0.f322471a);
            default:
                u it9 = (u) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f110773b.f110756a;
        }
    }

    public /* synthetic */ a(h hVar) {
        this.f110449a = 28;
    }
}
