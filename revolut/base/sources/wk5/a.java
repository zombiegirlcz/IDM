package wk5;

import kotlin.enums.EnumEntries;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ALGORAND;
    public static final a ARBITRUM;
    public static final a AVALANCHE;
    public static final a BASE;
    public static final a BITCOIN;
    public static final a BITCOINCASH;
    public static final a BSC;
    public static final a CARDANO;
    public static final a CELO;
    public static final a COSMOS;
    public static final a DASH;
    public static final a DOGECOIN;
    public static final a EOS;
    public static final a ETHEREUM;
    public static final a ETHEREUMCLASSIC;
    public static final a FANTOM;
    public static final a HEDERAHASHGRAPH;
    public static final a KAVA;
    public static final a KUSAMA;
    public static final a LITECOIN;
    public static final a NEAR;
    public static final a OPTIMISM;
    public static final a POLKADOT;
    public static final a POLYGON;
    public static final a RIPPLE;
    public static final a SMARTCHAIN;
    public static final a SOLANA;
    public static final a STELLAR;
    public static final a TEZOS;
    public static final a TON;
    public static final a TRON;
    public static final a UNSPECIFIED;
    public static final a WORLDCHAIN;

    static {
        a aVar = new a("UNSPECIFIED", 0);
        UNSPECIFIED = aVar;
        a aVar2 = new a("ARBITRUM", 1);
        ARBITRUM = aVar2;
        a aVar3 = new a("BITCOIN", 2);
        BITCOIN = aVar3;
        a aVar4 = new a("RIPPLE", 3);
        RIPPLE = aVar4;
        a aVar5 = new a("BITCOINCASH", 4);
        BITCOINCASH = aVar5;
        a aVar6 = new a("LITECOIN", 5);
        LITECOIN = aVar6;
        a aVar7 = new a("ETHEREUM", 6);
        ETHEREUM = aVar7;
        a aVar8 = new a("DOGECOIN", 7);
        DOGECOIN = aVar8;
        a aVar9 = new a("CARDANO", 8);
        CARDANO = aVar9;
        a aVar10 = new a("STELLAR", 9);
        STELLAR = aVar10;
        a aVar11 = new a("POLKADOT", 10);
        POLKADOT = aVar11;
        a aVar12 = new a("SOLANA", 11);
        SOLANA = aVar12;
        a aVar13 = new a("AVALANCHE", 12);
        AVALANCHE = aVar13;
        a aVar14 = new a("EOS", 13);
        EOS = aVar14;
        a aVar15 = new a("TEZOS", 14);
        TEZOS = aVar15;
        a aVar16 = new a("DASH", 15);
        DASH = aVar16;
        a aVar17 = new a("ALGORAND", 16);
        ALGORAND = aVar17;
        a aVar18 = new a("CELO", 17);
        CELO = aVar18;
        a aVar19 = new a("SMARTCHAIN", 18);
        SMARTCHAIN = aVar19;
        a aVar20 = new a("POLYGON", 19);
        POLYGON = aVar20;
        a aVar21 = new a("FANTOM", 20);
        FANTOM = aVar21;
        a aVar22 = new a("OPTIMISM", 21);
        OPTIMISM = aVar22;
        a aVar23 = new a("COSMOS", 22);
        COSMOS = aVar23;
        a aVar24 = new a("KUSAMA", 23);
        KUSAMA = aVar24;
        a aVar25 = new a("ETHEREUMCLASSIC", 24);
        ETHEREUMCLASSIC = aVar25;
        a aVar26 = new a("HEDERAHASHGRAPH", 25);
        HEDERAHASHGRAPH = aVar26;
        a aVar27 = new a("TRON", 26);
        TRON = aVar27;
        a aVar28 = new a("KAVA", 27);
        KAVA = aVar28;
        a aVar29 = new a("NEAR", 28);
        NEAR = aVar29;
        a aVar30 = new a("TON", 29);
        TON = aVar30;
        a aVar31 = new a("WORLDCHAIN", 30);
        WORLDCHAIN = aVar31;
        a aVar32 = new a("BASE", 31);
        BASE = aVar32;
        a aVar33 = new a("BSC", 32);
        BSC = aVar33;
        a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25, aVar26, aVar27, aVar28, aVar29, aVar30, aVar31, aVar32, aVar33};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public static EnumEntries a() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
