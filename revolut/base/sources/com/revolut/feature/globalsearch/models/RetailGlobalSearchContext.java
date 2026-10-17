package com.revolut.feature.globalsearch.models;

import android.os.Parcel;
import android.os.Parcelable;
import him.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.q0;
import zhm.w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/globalsearch/models/RetailGlobalSearchContext;", "Lcom/revolut/feature/globalsearch/models/GlobalSearchContext;", "", "Companion", "a", "MAIN_HOME", "WEALTH_HOME", "CRYPTO_HOME", "LIFESTYLE_HOME", "WEALTH_TRADE", "REVX_HOME", "feature_global_search_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailGlobalSearchContext implements GlobalSearchContext {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetailGlobalSearchContext[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<RetailGlobalSearchContext> CREATOR;
    public static final RetailGlobalSearchContext CRYPTO_HOME;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final RetailGlobalSearchContext LIFESTYLE_HOME;
    public static final RetailGlobalSearchContext MAIN_HOME;
    public static final RetailGlobalSearchContext REVX_HOME;
    public static final RetailGlobalSearchContext WEALTH_HOME;
    public static final RetailGlobalSearchContext WEALTH_TRADE;

    @NotNull
    private static final Map<String, RetailGlobalSearchContext> valuesByName;

    /* JADX INFO: renamed from: com.revolut.feature.globalsearch.models.RetailGlobalSearchContext$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return RetailGlobalSearchContext.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RetailGlobalSearchContext[i];
        }
    }

    static {
        RetailGlobalSearchContext retailGlobalSearchContext = new RetailGlobalSearchContext("MAIN_HOME", 0);
        MAIN_HOME = retailGlobalSearchContext;
        RetailGlobalSearchContext retailGlobalSearchContext2 = new RetailGlobalSearchContext("WEALTH_HOME", 1);
        WEALTH_HOME = retailGlobalSearchContext2;
        RetailGlobalSearchContext retailGlobalSearchContext3 = new RetailGlobalSearchContext("CRYPTO_HOME", 2);
        CRYPTO_HOME = retailGlobalSearchContext3;
        RetailGlobalSearchContext retailGlobalSearchContext4 = new RetailGlobalSearchContext("LIFESTYLE_HOME", 3);
        LIFESTYLE_HOME = retailGlobalSearchContext4;
        RetailGlobalSearchContext retailGlobalSearchContext5 = new RetailGlobalSearchContext("WEALTH_TRADE", 4);
        WEALTH_TRADE = retailGlobalSearchContext5;
        RetailGlobalSearchContext retailGlobalSearchContext6 = new RetailGlobalSearchContext("REVX_HOME", 5);
        REVX_HOME = retailGlobalSearchContext6;
        RetailGlobalSearchContext[] retailGlobalSearchContextArr = {retailGlobalSearchContext, retailGlobalSearchContext2, retailGlobalSearchContext3, retailGlobalSearchContext4, retailGlobalSearchContext5, retailGlobalSearchContext6};
        $VALUES = retailGlobalSearchContextArr;
        a aVarN = s.n(retailGlobalSearchContextArr);
        $ENTRIES = aVarN;
        INSTANCE = new Companion();
        CREATOR = new b();
        int iB = q0.b(w.t(aVarN, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (Object obj2 : aVarN) {
            linkedHashMap.put(((RetailGlobalSearchContext) obj2).name(), obj2);
        }
        valuesByName = linkedHashMap;
    }

    public static RetailGlobalSearchContext valueOf(String str) {
        return (RetailGlobalSearchContext) Enum.valueOf(RetailGlobalSearchContext.class, str);
    }

    public static RetailGlobalSearchContext[] values() {
        return (RetailGlobalSearchContext[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
