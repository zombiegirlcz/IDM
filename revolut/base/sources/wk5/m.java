package wk5;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f298253a = r0.k(new Pair("BITCOIN", k.BITCOIN), new Pair("RIPPLE", k.RIPPLE), new Pair("EVM", k.EVM), new Pair("SPL", k.SPL), new Pair("TRON", k.TRON), new Pair("HEDERA", k.HEDERA), new Pair("BITCOINCASH", k.BITCOINCASH), new Pair("LITECOIN", k.LITECOIN), new Pair("DOGECOIN", k.DOGECOIN), new Pair("CARDANO", k.CARDANO), new Pair("STELLAR", k.STELLAR), new Pair("POLKADOT", k.POLKADOT), new Pair("EOS", k.EOS), new Pair("TEZOS", k.TEZOS), new Pair("DASH", k.DASH), new Pair("ALGORAND", k.ALGORAND), new Pair("CELO", k.CELO), new Pair("FANTOM", k.FANTOM), new Pair("COSMOS", k.COSMOS), new Pair("KUSAMA", k.KUSAMA), new Pair("KAVA", k.KAVA), new Pair("NEAR", k.NEAR), new Pair("TVM", k.TVM));

    public static final k a(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        switch (l.f298251a[aVar.ordinal()]) {
            case 1:
                return k.UNKNOWN;
            case 2:
                return k.BITCOIN;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return k.EVM;
            case 13:
                return k.TRON;
            case 14:
                return k.SPL;
            case 15:
                return k.HEDERA;
            case 16:
                return k.RIPPLE;
            case 17:
                return k.BITCOINCASH;
            case 18:
                return k.LITECOIN;
            case 19:
                return k.DOGECOIN;
            case 20:
                return k.CARDANO;
            case 21:
                return k.STELLAR;
            case 22:
                return k.POLKADOT;
            case 23:
                return k.EOS;
            case 24:
                return k.TEZOS;
            case 25:
                return k.DASH;
            case 26:
                return k.ALGORAND;
            case 27:
                return k.CELO;
            case 28:
                return k.FANTOM;
            case 29:
                return k.COSMOS;
            case 30:
                return k.KUSAMA;
            case 31:
                return k.KAVA;
            case 32:
                return k.NEAR;
            case 33:
                return k.TVM;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
