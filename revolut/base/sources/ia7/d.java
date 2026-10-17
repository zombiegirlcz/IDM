package ia7;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d DEFAULT;
    public static final d INDIA;
    private final String cdnPathSegment;

    @NotNull
    private final String htmlUrl = a("globe.html");

    @NotNull
    private final String geoJsonUrl = a("countries.json");

    @NotNull
    private final String htmlFileName = b("globe.html");

    @NotNull
    private final String htmlCacheKey = b("globe_html_cache");

    @NotNull
    private final String htmlLastModifiedKey = b("globe_html_last_modified");

    @NotNull
    private final String geoJsonCacheKey = b("globe_geojson_cache");

    @NotNull
    private final String geoJsonLastModifiedKey = b("globe_geojson_last_modified");

    static {
        d dVar = new d("DEFAULT", 0, null);
        DEFAULT = dVar;
        d dVar2 = new d("INDIA", 1, "india");
        INDIA = dVar2;
        d[] dVarArr = {dVar, dVar2};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
        Companion = new c();
    }

    public d(String str, int i, String str2) {
        this.cdnPathSegment = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a(String str) {
        String[] elements = {"https://assets.revolut.com/mobile/analytics/globe", this.cdnPathSegment, str};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return d0.k0(kotlin.collections.d.L(elements), "/", null, null, 0, null, 62);
    }

    public final String b(String str) {
        String str2 = this.cdnPathSegment;
        String strConcat = str2 != null ? str2.concat("_") : null;
        if (strConcat == null) {
            strConcat = "";
        }
        return strConcat.concat(str);
    }

    public final String c() {
        return this.geoJsonCacheKey;
    }

    public final String d() {
        return this.geoJsonLastModifiedKey;
    }

    public final String e() {
        return this.geoJsonUrl;
    }

    public final String f() {
        return this.htmlCacheKey;
    }

    public final String h() {
        return this.htmlFileName;
    }

    public final String i() {
        return this.htmlLastModifiedKey;
    }

    public final String v5() {
        return this.htmlUrl;
    }
}
