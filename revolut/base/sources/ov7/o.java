package ov7;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.insurance_embedded.impl.data.model.CoverageDetailsLayout;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;
import xv7.r;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f229980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xv7.i f229981b;

    public o(r restrictionsSectionMapper, xv7.i exclusionsMapper, xv7.m legalNoticeSectionMapper) {
        Intrinsics.checkNotNullParameter(restrictionsSectionMapper, "restrictionsSectionMapper");
        Intrinsics.checkNotNullParameter(exclusionsMapper, "exclusionsMapper");
        Intrinsics.checkNotNullParameter(legalNoticeSectionMapper, "legalNoticeSectionMapper");
        this.f229980a = restrictionsSectionMapper;
        this.f229981b = exclusionsMapper;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        CoverageDetailsLayout.FooterButton footerButton;
        String str;
        j domainState = (j) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f229973a, new ou6.o(11), new oq3.e(22), new c1(this, domainState, 27));
        CoverageDetailsLayout coverageDetailsLayout = (CoverageDetailsLayout) domainState.f229973a.getContent();
        TextClause textClauseA = null;
        String str2 = coverageDetailsLayout != null ? coverageDetailsLayout.f75906b : null;
        if (str2 == null) {
            str2 = "";
        }
        TextClause textClauseA2 = sr7.c.a(str2, null);
        TextClause textClauseA3 = (coverageDetailsLayout == null || (str = coverageDetailsLayout.f75907c) == null) ? null : sr7.c.a(str, null);
        if (coverageDetailsLayout != null && (footerButton = coverageDetailsLayout.f75909h) != null) {
            textClauseA = sr7.c.a(footerButton.f75917a, null);
        }
        return new m(textClauseA2, textClauseA3, textClauseA, list);
    }
}
