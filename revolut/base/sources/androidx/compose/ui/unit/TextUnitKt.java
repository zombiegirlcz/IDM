package androidx.compose.ui.unit;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\"\u001f\u0010\u001f\u001a\u00020\u001b*\u00020\u00048Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001d\"\u001e\u0010$\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\"\u001e\u0010$\u001a\u00020\u0004*\u00020%8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010'\u001a\u0004\b \u0010&\"\u001e\u0010*\u001a\u00020\u0004*\u00020%8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010&\"\u001e\u0010$\u001a\u00020\u0004*\u00020+8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010-\u001a\u0004\b \u0010,\"\u001e\u0010*\u001a\u00020\u0004*\u00020+8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010-\u001a\u0004\b(\u0010,¨\u0006."}, d2 = {"", "value", "Landroidx/compose/ui/unit/TextUnitType;", "type", "Landroidx/compose/ui/unit/TextUnit;", "TextUnit-anM5pPY", "(FJ)J", "TextUnit", "", "unitType", "v", "pack", "(JF)J", "a", "", "checkArithmetic--R2X_6o", "(J)V", "checkArithmetic", "b", "checkArithmetic-NB67dxo", "(JJ)V", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "lerp", "", "isUnspecified--R2X_6o", "(J)Z", "isUnspecified--R2X_6o$annotations", "isUnspecified", "getSp", "(F)J", "getSp$annotations", "(F)V", "sp", "", "(D)J", "(D)V", "getEm", "getEm$annotations", "em", "", "(I)J", "(I)V", "ui-unit"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextUnitKt {
    /* JADX INFO: renamed from: TextUnit-anM5pPY, reason: not valid java name */
    public static final long m3376TextUnitanM5pPY(float f, long j2) {
        return pack(j2, f);
    }

    /* JADX INFO: renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m3377checkArithmeticR2X_6o(long j2) {
        if (TextUnit.m3368getRawTypeimpl(j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* JADX INFO: renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m3378checkArithmeticNB67dxo(long j2, long j3) {
        if (!((TextUnit.m3368getRawTypeimpl(j2) == 0 || TextUnit.m3368getRawTypeimpl(j3) == 0) ? false : true)) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m3384equalsimpl0(TextUnit.m3369getTypeUIouoOA(j2), TextUnit.m3369getTypeUIouoOA(j3))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m3386toStringimpl(TextUnit.m3369getTypeUIouoOA(j2))) + " and " + ((Object) TextUnitType.m3386toStringimpl(TextUnit.m3369getTypeUIouoOA(j3))));
    }

    public static final long getEm(double d) {
        return pack(8589934592L, (float) d);
    }

    public static final long getSp(float f) {
        return pack(4294967296L, f);
    }

    /* JADX INFO: renamed from: isUnspecified--R2X_6o, reason: not valid java name */
    public static final boolean m3379isUnspecifiedR2X_6o(long j2) {
        return TextUnit.m3368getRawTypeimpl(j2) == 0;
    }

    /* JADX INFO: renamed from: lerp-C3pnCVY, reason: not valid java name */
    public static final long m3380lerpC3pnCVY(long j2, long j3, float f) {
        m3378checkArithmeticNB67dxo(j2, j3);
        return pack(TextUnit.m3368getRawTypeimpl(j2), MathHelpersKt.lerp(TextUnit.m3370getValueimpl(j2), TextUnit.m3370getValueimpl(j3), f));
    }

    public static final long pack(long j2, float f) {
        return TextUnit.m3365constructorimpl(j2 | (((long) Float.floatToRawIntBits(f)) & BodyPartID.bodyIdMax));
    }

    public static final long getEm(int i) {
        return pack(8589934592L, i);
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }
}
