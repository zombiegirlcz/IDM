package pi5;

import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d FCA_CRYPTO_BASICS;
    public static final d FCA_INVEST;
    public static final d FCA_QUESTIONS;
    public static final d FOS;
    public static final d FSCS;
    public static final d RISK_SUMMARY;

    @NotNull
    private final String link;

    static {
        d dVar = new d("FSCS", 0, "https://www.fscs.org.uk/check/investment-protection-checker/");
        FSCS = dVar;
        d dVar2 = new d("FOS", 1, "https://www.financial-ombudsman.org.uk/consumers");
        FOS = dVar2;
        d dVar3 = new d("FCA_INVEST", 2, "https://www.fca.org.uk/investsmart/5-questions-ask-you-invest");
        FCA_INVEST = dVar3;
        d dVar4 = new d("FCA_QUESTIONS", 3, "https://www.fca.org.uk/investsmart");
        FCA_QUESTIONS = dVar4;
        d dVar5 = new d("FCA_CRYPTO_BASICS", 4, "https://www.fca.org.uk/investsmart/crypto-basics");
        FCA_CRYPTO_BASICS = dVar5;
        d dVar6 = new d("RISK_SUMMARY", 5, "https://www.revolut.com/legal/cryptoasset-specific-risks/");
        RISK_SUMMARY = dVar6;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        $VALUES = dVarArr;
        $ENTRIES = s.n(dVarArr);
    }

    public d(String str, int i, String str2) {
        this.link = str2;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final String a() {
        return this.link;
    }
}
