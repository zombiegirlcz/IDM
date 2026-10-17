package wk5;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f298251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f298252b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.UNSPECIFIED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.BITCOIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.ETHEREUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[a.POLYGON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[a.SMARTCHAIN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[a.ETHEREUMCLASSIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[a.AVALANCHE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[a.ARBITRUM.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[a.OPTIMISM.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[a.WORLDCHAIN.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[a.BASE.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[a.BSC.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[a.TRON.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[a.SOLANA.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[a.HEDERAHASHGRAPH.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[a.RIPPLE.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[a.BITCOINCASH.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[a.LITECOIN.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[a.DOGECOIN.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[a.CARDANO.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[a.STELLAR.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[a.POLKADOT.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[a.EOS.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[a.TEZOS.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[a.DASH.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[a.ALGORAND.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[a.CELO.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[a.FANTOM.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[a.COSMOS.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[a.KUSAMA.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[a.KAVA.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[a.NEAR.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[a.TON.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        f298251a = iArr;
        int[] iArr2 = new int[k.values().length];
        try {
            iArr2[k.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[k.BITCOIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[k.EVM.ordinal()] = 3;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[k.TRON.ordinal()] = 4;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[k.SPL.ordinal()] = 5;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[k.HEDERA.ordinal()] = 6;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[k.RIPPLE.ordinal()] = 7;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[k.BITCOINCASH.ordinal()] = 8;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[k.LITECOIN.ordinal()] = 9;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[k.DOGECOIN.ordinal()] = 10;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[k.CARDANO.ordinal()] = 11;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[k.STELLAR.ordinal()] = 12;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[k.POLKADOT.ordinal()] = 13;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[k.EOS.ordinal()] = 14;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[k.TEZOS.ordinal()] = 15;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[k.DASH.ordinal()] = 16;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[k.ALGORAND.ordinal()] = 17;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[k.CELO.ordinal()] = 18;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[k.FANTOM.ordinal()] = 19;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[k.COSMOS.ordinal()] = 20;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[k.KUSAMA.ordinal()] = 21;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[k.KAVA.ordinal()] = 22;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[k.NEAR.ordinal()] = 23;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[k.TVM.ordinal()] = 24;
        } catch (NoSuchFieldError unused57) {
        }
        f298252b = iArr2;
    }
}
