package gog;

import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.shared.feature.user_declarations.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ID;
    public static final a PASSPORT;

    @NotNull
    private final ResourceId displayNameResourceId;

    static {
        a aVar = new a("ID", 0, new ResourceId.IntResourceId(R$string.pep_close_connection_id_type_content_id));
        ID = aVar;
        a aVar2 = new a("PASSPORT", 1, new ResourceId.IntResourceId(R$string.pep_close_connection_id_type_content_passport));
        PASSPORT = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, ResourceId.IntResourceId intResourceId) {
        this.displayNameResourceId = intResourceId;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final ResourceId a() {
        return this.displayNameResourceId;
    }
}
