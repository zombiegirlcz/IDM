package gog;

import com.revolut.core.ui_kit.models.ResourceId;
import com.revolut.shared.feature.user_declarations.api.R$string;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class b {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BUSINESS_PARTNER;
    public static final b CHILD;
    public static final b CO_SIGNER;
    public static final b GRANDCHILD;
    public static final b GRANDPARENT;
    public static final b LEGAL_OR_FINANCIAL_ADVISOR;
    public static final b OTHER;
    public static final b PARENT;
    public static final b PARENT_IN_LAW;
    public static final b SIBLING;
    public static final b SIBLING_IN_LAW;
    public static final b SPOUSE_OR_PARTNER;

    @NotNull
    private final ResourceId displayNameResourceId;

    static {
        b bVar = new b("SPOUSE_OR_PARTNER", 0, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_spouse_or_partner));
        SPOUSE_OR_PARTNER = bVar;
        b bVar2 = new b("PARENT", 1, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_parent));
        PARENT = bVar2;
        b bVar3 = new b("CHILD", 2, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_child));
        CHILD = bVar3;
        b bVar4 = new b("SIBLING", 3, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_sibling));
        SIBLING = bVar4;
        b bVar5 = new b("GRANDPARENT", 4, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_grandparent));
        GRANDPARENT = bVar5;
        b bVar6 = new b("GRANDCHILD", 5, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_grandchild));
        GRANDCHILD = bVar6;
        b bVar7 = new b("PARENT_IN_LAW", 6, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_parent_in_law));
        PARENT_IN_LAW = bVar7;
        b bVar8 = new b("SIBLING_IN_LAW", 7, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_sibling_in_law));
        SIBLING_IN_LAW = bVar8;
        b bVar9 = new b("BUSINESS_PARTNER", 8, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_business_partner));
        BUSINESS_PARTNER = bVar9;
        b bVar10 = new b("CO_SIGNER", 9, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_co_signer));
        CO_SIGNER = bVar10;
        b bVar11 = new b("LEGAL_OR_FINANCIAL_ADVISOR", 10, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_legal_or_financial_advisor));
        LEGAL_OR_FINANCIAL_ADVISOR = bVar11;
        b bVar12 = new b("OTHER", 11, new ResourceId.IntResourceId(R$string.pep_close_connection_relationship_descriptive_other));
        OTHER = bVar12;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12};
        $VALUES = bVarArr;
        $ENTRIES = s.n(bVarArr);
    }

    public b(String str, int i, ResourceId.IntResourceId intResourceId) {
        this.displayNameResourceId = intResourceId;
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final ResourceId a() {
        return this.displayNameResourceId;
    }
}
