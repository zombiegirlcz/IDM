package wk5;

import java.util.Set;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k ALGORAND;
    public static final k BITCOIN;
    public static final k BITCOINCASH;
    public static final k CARDANO;
    public static final k CELO;
    public static final k COSMOS;

    @NotNull
    public static final j Companion;
    public static final k DASH;
    public static final k DOGECOIN;
    public static final k EOS;
    public static final k EVM;
    public static final k FANTOM;
    public static final k HEDERA;
    public static final k KAVA;
    public static final k KUSAMA;
    public static final k LITECOIN;
    public static final k NEAR;
    public static final k POLKADOT;
    public static final k RIPPLE;
    public static final k SPL;
    public static final k STELLAR;
    public static final k TEZOS;
    public static final k TRON;
    public static final k TVM;
    public static final k UNKNOWN;

    @NotNull
    private static final Set<k> tagAddressTypes;

    static {
        k kVar = new k("UNKNOWN", 0);
        UNKNOWN = kVar;
        k kVar2 = new k("BITCOIN", 1);
        BITCOIN = kVar2;
        k kVar3 = new k("RIPPLE", 2);
        RIPPLE = kVar3;
        k kVar4 = new k("EVM", 3);
        EVM = kVar4;
        k kVar5 = new k("SPL", 4);
        SPL = kVar5;
        k kVar6 = new k("TRON", 5);
        TRON = kVar6;
        k kVar7 = new k("HEDERA", 6);
        HEDERA = kVar7;
        k kVar8 = new k("BITCOINCASH", 7);
        BITCOINCASH = kVar8;
        k kVar9 = new k("LITECOIN", 8);
        LITECOIN = kVar9;
        k kVar10 = new k("DOGECOIN", 9);
        DOGECOIN = kVar10;
        k kVar11 = new k("CARDANO", 10);
        CARDANO = kVar11;
        k kVar12 = new k("STELLAR", 11);
        STELLAR = kVar12;
        k kVar13 = new k("POLKADOT", 12);
        POLKADOT = kVar13;
        k kVar14 = new k("EOS", 13);
        EOS = kVar14;
        k kVar15 = new k("TEZOS", 14);
        TEZOS = kVar15;
        k kVar16 = new k("DASH", 15);
        DASH = kVar16;
        k kVar17 = new k("ALGORAND", 16);
        ALGORAND = kVar17;
        k kVar18 = new k("CELO", 17);
        CELO = kVar18;
        k kVar19 = new k("FANTOM", 18);
        FANTOM = kVar19;
        k kVar20 = new k("COSMOS", 19);
        COSMOS = kVar20;
        k kVar21 = new k("KUSAMA", 20);
        KUSAMA = kVar21;
        k kVar22 = new k("KAVA", 21);
        KAVA = kVar22;
        k kVar23 = new k("NEAR", 22);
        NEAR = kVar23;
        k kVar24 = new k("TVM", 23);
        TVM = kVar24;
        k[] kVarArr = {kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24};
        $VALUES = kVarArr;
        $ENTRIES = s.n(kVarArr);
        Companion = new j();
        k[] elements = {kVar3, kVar12};
        Intrinsics.checkNotNullParameter(elements, "elements");
        tagAddressTypes = kotlin.collections.d.y0(elements);
    }

    public static EnumEntries b() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
