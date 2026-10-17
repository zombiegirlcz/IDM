package iaa;

import com.revolut.feature.product_article.api.models.ProductArticleParams;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ONBOARDING;

    @NotNull
    private final e config;

    static {
        Intrinsics.checkNotNullParameter("5d48aa20-8f4d-44d9-8b09-c0cc43c6e217", "developmentArticleId");
        Intrinsics.checkNotNullParameter("43dc1912-9407-48f8-a53c-e9e8d8d1631c", "productionArticleId");
        f fVar = new f(new e());
        ONBOARDING = fVar;
        f[] fVarArr = {fVar};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public f(e eVar) {
        this.config = eVar;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final ProductArticleParams a() {
        String str;
        e eVar = this.config;
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e()) {
            eVar.getClass();
            str = "5d48aa20-8f4d-44d9-8b09-c0cc43c6e217";
        } else {
            str = null;
        }
        if (str == null) {
            eVar.getClass();
            str = "43dc1912-9407-48f8-a53c-e9e8d8d1631c";
        }
        return new ProductArticleParams(new ProductArticleParams.ArticleReference.Id(str));
    }
}
