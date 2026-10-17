package xv1;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
public final class a {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a ABOUT;
    public static final a ONBOARDING;

    @NotNull
    private final String articleId;

    static {
        a aVar = new a("ONBOARDING", 0, "bre-b-onboarding");
        ONBOARDING = aVar;
        a aVar2 = new a("ABOUT", 1, "about-bre-b");
        ABOUT = aVar2;
        a[] aVarArr = {aVar, aVar2};
        $VALUES = aVarArr;
        $ENTRIES = s.n(aVarArr);
    }

    public a(String str, int i, String str2) {
        this.articleId = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final ProductArticleParams a() {
        return new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(this.articleId));
    }
}
