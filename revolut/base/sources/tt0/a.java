package tt0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.enums.EnumEntries;
import vc.s;
import yhm.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a MATCH_PARENT;
    public static final a WRAP_CONTENT;

    @d
    public static final a WRAP_CONTENT_WITH_PADDINGS;
    private final int layoutHeightParam;
    private final float verticalPaddingDp;

    static {
        a aVar = new a("MATCH_PARENT", 0, -1, BitmapDescriptorFactory.HUE_RED);
        MATCH_PARENT = aVar;
        a aVar2 = new a("WRAP_CONTENT_WITH_PADDINGS", 1, -2, 40.0f);
        WRAP_CONTENT_WITH_PADDINGS = aVar2;
        a aVar3 = new a("WRAP_CONTENT", 2, -2, BitmapDescriptorFactory.HUE_RED);
        WRAP_CONTENT = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, int i2, float f) {
        this.layoutHeightParam = i2;
        this.verticalPaddingDp = f;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.layoutHeightParam;
    }

    public final float b() {
        return this.verticalPaddingDp;
    }
}
