package pt0;

import com.youTransactor.uCube.rpc.Constants;
import kotlin.enums.EnumEntries;
import org.bouncycastle.asn1.BERTags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class i {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ i[] $VALUES;
    public static final i HalfCircle;
    public static final i PlainDark;
    public static final i TransparentReference;
    private final float blurRadiusDp;
    private final int maskCenterAlpha;
    private final int maskOuterFadeStartAlpha;
    private final int maskRingAlpha;
    private final int maskSourceInnerAlpha;
    private final float opacity;
    private final int sourcePlateauSuppressAlpha;

    static {
        i iVar = new i("TransparentReference", 0, 0.4f, Constants.TAG_SVPP_CHECKSUM, 80, 128, BERTags.FLAGS, BERTags.FLAGS, 175.0f);
        TransparentReference = iVar;
        i iVar2 = new i("PlainDark", 1, 0.5f, 160, 255, 255, 255, 255, 175.0f);
        PlainDark = iVar2;
        i iVar3 = new i("HalfCircle", 2, 0.65f, 185, 32, 96, 255, 240, 65.0f);
        HalfCircle = iVar3;
        i[] iVarArr = {iVar, iVar2, iVar3};
        $VALUES = iVarArr;
        $ENTRIES = vc.s.n(iVarArr);
    }

    public i(String str, int i, float f, int i2, int i3, int i5, int i6, int i21, float f4) {
        this.opacity = f;
        this.sourcePlateauSuppressAlpha = i2;
        this.maskCenterAlpha = i3;
        this.maskSourceInnerAlpha = i5;
        this.maskRingAlpha = i6;
        this.maskOuterFadeStartAlpha = i21;
        this.blurRadiusDp = f4;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }

    public final float a() {
        return this.blurRadiusDp;
    }

    public final int b() {
        return this.maskCenterAlpha;
    }

    public final int c() {
        return this.maskOuterFadeStartAlpha;
    }

    public final int d() {
        return this.maskRingAlpha;
    }

    public final int e() {
        return this.maskSourceInnerAlpha;
    }

    public final float f() {
        return this.opacity;
    }

    public final int h() {
        return this.sourcePlateauSuppressAlpha;
    }
}
