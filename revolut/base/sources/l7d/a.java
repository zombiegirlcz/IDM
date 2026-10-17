package l7d;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.tracking.v3.AiSearchContext;
import com.revolut.tracking.v3.TroubleshooterContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static w0 a(String userInput, String str, String str2, String str3, ArrayList arrayList, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 16) != 0) {
            arrayList = null;
        }
        if ((i & 32) != 0) {
            str4 = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        if ((i & 128) != 0) {
            bool = null;
        }
        if ((i & 256) != 0) {
            bool2 = null;
        }
        Intrinsics.checkNotNullParameter(userInput, "userInput");
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        AiSearchContext.b bVarNewBuilder = AiSearchContext.newBuilder();
        bVarNewBuilder.c();
        ((AiSearchContext) bVarNewBuilder.f49761b).setSearchBarContent(userInput);
        if (str != null) {
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setSearchRequestId(str);
        }
        if (str2 != null) {
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setSelectedSuggestionString(str2);
        }
        if (str3 != null) {
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setSelectedFaqKey(str3);
        }
        if (arrayList != null) {
            int i2 = 0;
            for (Object obj2 : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    v.s();
                    throw null;
                }
                String str6 = (String) obj2;
                str6.getClass();
                bVarNewBuilder.c();
                ((AiSearchContext) bVarNewBuilder.f49761b).getMutableArticlesMap().put(Integer.valueOf(i2), str6);
                i2 = i3;
            }
        }
        if (str4 != null) {
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setShortAnswer(str4);
        }
        if (str5 != null) {
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setAnswerExplainer(str5);
        }
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setFeatureFeedbackVisible(zBooleanValue);
        }
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            bVarNewBuilder.c();
            ((AiSearchContext) bVarNewBuilder.f49761b).setAnimationCompleted(zBooleanValue2);
        }
        w0 w0VarA = bVarNewBuilder.a();
        companion.getClass();
        return AnalyticsContext.Companion.a(w0VarA);
    }

    public static final AnalyticsContext b(String str) {
        if (str != null) {
            return new AnalyticsContext(v0.a.b(str, AnalyticsContext.INSTANCE));
        }
        return null;
    }

    public static final AnalyticsContext c(String str, String str2, List list) {
        if (str == null && str2 == null && list == null) {
            return null;
        }
        AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
        TroubleshooterContext.a aVarNewBuilder = TroubleshooterContext.newBuilder();
        if (str != null) {
            aVarNewBuilder.c();
            ((TroubleshooterContext) aVarNewBuilder.f49761b).setEntityId(str);
        }
        if (str2 != null) {
            aVarNewBuilder.c();
            ((TroubleshooterContext) aVarNewBuilder.f49761b).setKey(str2);
        }
        if (list != null) {
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    v.s();
                    throw null;
                }
                String str3 = (String) obj2;
                aVarNewBuilder.getClass();
                str3.getClass();
                aVarNewBuilder.c();
                ((TroubleshooterContext) aVarNewBuilder.f49761b).getMutableTroubleshootersMap().put(Integer.valueOf(i), str3);
                i = i2;
            }
        }
        w0 w0VarA = aVarNewBuilder.a();
        companion.getClass();
        return new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA));
    }

    public static /* synthetic */ AnalyticsContext d(int i, String str, String str2) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c(str, str2, null);
    }
}
