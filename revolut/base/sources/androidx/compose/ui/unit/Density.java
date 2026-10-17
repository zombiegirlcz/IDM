package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0002H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u000bH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0007H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0002*\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u0005J\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u0003H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0018\u001a\u00020\u0015*\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u001a\u001a\u00020\u0014*\u00020\u0015H\u0017¢\u0006\u0004\b\u0019\u0010\u0017R\u001a\u0010\u001f\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "Landroidx/compose/ui/unit/Dp;", "", "toPx-0680j_4", "(F)F", "toPx", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "toPx--R2X_6o", "(J)F", "toDp-u2uoSUM", "(I)F", "toDp", "toSp-kPz2Gy4", "(F)J", "toSp", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toSize-XkaWNTQ", "(J)J", "toSize", "toDpSize-k-rfVVM", "toDpSize", "getDensity", "()F", "getDensity$annotations", "()V", "density", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Density extends FontScaling {
    float getDensity();

    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    default int mo762roundToPx0680j_4(float f) {
        float fMo768toPx0680j_4 = mo768toPx0680j_4(f);
        if (Float.isInfinite(fMo768toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo768toPx0680j_4);
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo765toDpu2uoSUM(int i) {
        return Dp.m3297constructorimpl(i / getDensity());
    }

    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    default long mo766toDpSizekrfVVM(long j2) {
        return j2 != 9205357640488583168L ? DpKt.m3307DpSizeYgX7TsA(mo764toDpu2uoSUM(Float.intBitsToFloat((int) (j2 >> 32))), mo764toDpu2uoSUM(Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)))) : DpSize.INSTANCE.m3326getUnspecifiedMYxV2XQ();
    }

    /* JADX INFO: renamed from: toPx--R2X_6o */
    default float mo767toPxR2X_6o(long j2) {
        if (!TextUnitType.m3384equalsimpl0(TextUnit.m3369getTypeUIouoOA(j2), TextUnitType.INSTANCE.m3389getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo768toPx0680j_4(mo763toDpGaN1DYA(j2));
    }

    /* JADX INFO: renamed from: toPx-0680j_4 */
    default float mo768toPx0680j_4(float f) {
        return getDensity() * f;
    }

    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    default long mo769toSizeXkaWNTQ(long j2) {
        if (j2 == 9205357640488583168L) {
            return Size.INSTANCE.m1874getUnspecifiedNHjbRc();
        }
        float fMo768toPx0680j_4 = mo768toPx0680j_4(DpSize.m3322getWidthD9Ej5fM(j2));
        return Size.m1862constructorimpl((((long) Float.floatToRawIntBits(mo768toPx0680j_4(DpSize.m3321getHeightD9Ej5fM(j2)))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMo768toPx0680j_4) << 32));
    }

    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    default long mo771toSpkPz2Gy4(float f) {
        return mo770toSp0xMU5do(mo764toDpu2uoSUM(f));
    }

    /* JADX INFO: renamed from: toDp-u2uoSUM */
    default float mo764toDpu2uoSUM(float f) {
        return Dp.m3297constructorimpl(f / getDensity());
    }
}
