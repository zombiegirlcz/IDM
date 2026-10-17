package et0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class d0 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d0[] $VALUES;
    public static final d0 BOTTOM_RIGHT;
    public static final d0 IN_TEXT;
    public static final d0 RIGHT_FROM_TEXT;
    private final float bottomMarginDp;
    private final int bottomToBottomAnchor;
    private final int startToEndAnchor;
    private final int topToBottomAnchor;

    static {
        int i = R$id.chatBubble_description;
        d0 d0Var = new d0("IN_TEXT", 0, -1, -1, i, BitmapDescriptorFactory.HUE_RED);
        IN_TEXT = d0Var;
        d0 d0Var2 = new d0("RIGHT_FROM_TEXT", 1, -1, i, i, BitmapDescriptorFactory.HUE_RED);
        RIGHT_FROM_TEXT = d0Var2;
        d0 d0Var3 = new d0("BOTTOM_RIGHT", 2, R$id.chatBubble_bottomViewsBarrier, -1, 0, 8.0f);
        BOTTOM_RIGHT = d0Var3;
        d0[] d0VarArr = {d0Var, d0Var2, d0Var3};
        $VALUES = d0VarArr;
        $ENTRIES = vc.s.n(d0VarArr);
    }

    public d0(String str, int i, int i2, int i3, int i5, float f) {
        this.topToBottomAnchor = i2;
        this.startToEndAnchor = i3;
        this.bottomToBottomAnchor = i5;
        this.bottomMarginDp = f;
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) $VALUES.clone();
    }

    public final float a() {
        return this.bottomMarginDp;
    }

    public final int b() {
        return this.bottomToBottomAnchor;
    }

    public final int c() {
        return this.startToEndAnchor;
    }

    public final int d() {
        return this.topToBottomAnchor;
    }
}
