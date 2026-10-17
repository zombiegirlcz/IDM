package com.revolut.retail.feature.pricing_plans.ui.impl.flows.graduate_student;

import bhk.f;
import bhk.g;
import cha.c;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.retail.feature.pricing_plans.ui.impl.flows.student.StudentProductArticleKey;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import yki.i;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends h implements bhk.b {

    @NotNull
    public static final g Companion = new g();
    public final GraduateStudentFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f103039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zja.a f103040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ProductArticleParams f103041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f103042s;

    public b(GraduateStudentFlowContract$InputData inputData, c studentPlanInteractor, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(studentPlanInteractor, "studentPlanInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f103039p = studentPlanInteractor;
        this.f103040q = productArticleInteractor;
        this.f103041r = new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(StudentProductArticleKey.STUDENT_GRADUATION));
        this.f103042s = d.a(this, new bhi.c(this, 1));
    }

    public final a2 I2() {
        return A1(new aza.g(this, null, 14), new f(this, 0));
    }

    @Override // yki.j
    public final void M0() {
        if (this.o.f103037a) {
            l2(new a(this, null), new yi5.b(26));
        } else {
            I2();
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f103042s;
    }
}
