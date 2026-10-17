package ewl;

import androidx.core.content.ContextCompat;
import aw0.o9;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.ui.activity.container.ContainerActivity;
import efm.r;
import ew2.q;
import hqi.n;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import w01.k;
import ypi.j;

/* JADX INFO: loaded from: classes12.dex */
public final class i extends pri.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f130328h;
    public final n i;

    public i(j nextButtonViewModel, n toolbarViewModel) {
        Intrinsics.checkNotNullParameter(nextButtonViewModel, "nextButtonViewModel");
        Intrinsics.checkNotNullParameter(toolbarViewModel, "toolbarViewModel");
        this.f130328h = nextButtonViewModel;
        this.i = toolbarViewModel;
    }

    @Override // pri.b, pri.e
    public final void h(rri.a aVar) {
        f view = (f) aVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.h(view);
        hqi.a aVar2 = (hqi.a) this.i;
        ihm.b bVar = aVar2.f154697a;
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: ewl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f130327b;

            {
                this.f130327b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "it");
                        f fVar = (f) this.f130327b.L();
                        if (fVar != null) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((ContainerActivity) fVar).f285752s0.b().setToolbarTitle(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj2;
                        num.intValue();
                        f fVar2 = (f) this.f130327b.L();
                        if (fVar2 != null) {
                            ((ContainerActivity) fVar2).f285752s0.b().setNavigationButtonIcon(num);
                        }
                        break;
                    case 2:
                        String text = (String) obj2;
                        Intrinsics.checkNotNullParameter(text, "it");
                        f fVar3 = (f) this.f130327b.L();
                        if (fVar3 != null) {
                            Intrinsics.checkNotNullParameter(text, "text");
                            ((ContainerActivity) fVar3).f285752s0.a().setText(text);
                        }
                        break;
                    case 3:
                        int iIntValue = ((Integer) obj2).intValue();
                        f fVar4 = (f) this.f130327b.L();
                        if (fVar4 != null) {
                            ContainerActivity containerActivity = (ContainerActivity) fVar4;
                            containerActivity.f285752s0.a().setBackground(ContextCompat.getDrawable(containerActivity, iIntValue));
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        f fVar5 = (f) this.f130327b.L();
                        if (fVar5 != null) {
                            k.e(((ContainerActivity) fVar5).f285752s0.a(), zBooleanValue);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K = K();
        Function0 function0J = J();
        r rVarOnErrorResumeNext = bVar.onErrorResumeNext(new a08.r(16, new q(new BreadcrumbException(), 3)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0d.g(13, function1), new a0d.g(13, function1K), new ea9.c(3, function0J));
        ifm.b bVar2 = this.f239031a;
        w.j0(bVar2, cVarSubscribe);
        Intrinsics.h(cVarSubscribe);
        ihm.b bVar3 = aVar2.f154698b;
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: ewl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f130327b;

            {
                this.f130327b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "it");
                        f fVar = (f) this.f130327b.L();
                        if (fVar != null) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((ContainerActivity) fVar).f285752s0.b().setToolbarTitle(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj2;
                        num.intValue();
                        f fVar2 = (f) this.f130327b.L();
                        if (fVar2 != null) {
                            ((ContainerActivity) fVar2).f285752s0.b().setNavigationButtonIcon(num);
                        }
                        break;
                    case 2:
                        String text = (String) obj2;
                        Intrinsics.checkNotNullParameter(text, "it");
                        f fVar3 = (f) this.f130327b.L();
                        if (fVar3 != null) {
                            Intrinsics.checkNotNullParameter(text, "text");
                            ((ContainerActivity) fVar3).f285752s0.a().setText(text);
                        }
                        break;
                    case 3:
                        int iIntValue = ((Integer) obj2).intValue();
                        f fVar4 = (f) this.f130327b.L();
                        if (fVar4 != null) {
                            ContainerActivity containerActivity = (ContainerActivity) fVar4;
                            containerActivity.f285752s0.a().setBackground(ContextCompat.getDrawable(containerActivity, iIntValue));
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        f fVar5 = (f) this.f130327b.L();
                        if (fVar5 != null) {
                            k.e(((ContainerActivity) fVar5).f285752s0.a(), zBooleanValue);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K2 = K();
        Function0 function0J2 = J();
        r rVarOnErrorResumeNext2 = bVar3.onErrorResumeNext(new a08.r(16, new q(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0d.g(13, function12), new a0d.g(13, function1K2), new ea9.c(3, function0J2));
        w.j0(bVar2, cVarSubscribe2);
        Intrinsics.h(cVarSubscribe2);
        ypi.a aVar3 = (ypi.a) this.f130328h;
        ihm.b bVar4 = aVar3.f315905b;
        final int i3 = 2;
        Function1 function13 = new Function1(this) { // from class: ewl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f130327b;

            {
                this.f130327b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "it");
                        f fVar = (f) this.f130327b.L();
                        if (fVar != null) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((ContainerActivity) fVar).f285752s0.b().setToolbarTitle(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj2;
                        num.intValue();
                        f fVar2 = (f) this.f130327b.L();
                        if (fVar2 != null) {
                            ((ContainerActivity) fVar2).f285752s0.b().setNavigationButtonIcon(num);
                        }
                        break;
                    case 2:
                        String text = (String) obj2;
                        Intrinsics.checkNotNullParameter(text, "it");
                        f fVar3 = (f) this.f130327b.L();
                        if (fVar3 != null) {
                            Intrinsics.checkNotNullParameter(text, "text");
                            ((ContainerActivity) fVar3).f285752s0.a().setText(text);
                        }
                        break;
                    case 3:
                        int iIntValue = ((Integer) obj2).intValue();
                        f fVar4 = (f) this.f130327b.L();
                        if (fVar4 != null) {
                            ContainerActivity containerActivity = (ContainerActivity) fVar4;
                            containerActivity.f285752s0.a().setBackground(ContextCompat.getDrawable(containerActivity, iIntValue));
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        f fVar5 = (f) this.f130327b.L();
                        if (fVar5 != null) {
                            k.e(((ContainerActivity) fVar5).f285752s0.a(), zBooleanValue);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K3 = K();
        Function0 function0J3 = J();
        r rVarOnErrorResumeNext3 = bVar4.onErrorResumeNext(new a08.r(16, new q(new BreadcrumbException(), 5)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a0d.g(13, function13), new a0d.g(13, function1K3), new ea9.c(3, function0J3));
        w.j0(bVar2, cVarSubscribe3);
        Intrinsics.h(cVarSubscribe3);
        ihm.b bVar5 = aVar3.k;
        final int i5 = 3;
        Function1 function14 = new Function1(this) { // from class: ewl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f130327b;

            {
                this.f130327b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "it");
                        f fVar = (f) this.f130327b.L();
                        if (fVar != null) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((ContainerActivity) fVar).f285752s0.b().setToolbarTitle(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj2;
                        num.intValue();
                        f fVar2 = (f) this.f130327b.L();
                        if (fVar2 != null) {
                            ((ContainerActivity) fVar2).f285752s0.b().setNavigationButtonIcon(num);
                        }
                        break;
                    case 2:
                        String text = (String) obj2;
                        Intrinsics.checkNotNullParameter(text, "it");
                        f fVar3 = (f) this.f130327b.L();
                        if (fVar3 != null) {
                            Intrinsics.checkNotNullParameter(text, "text");
                            ((ContainerActivity) fVar3).f285752s0.a().setText(text);
                        }
                        break;
                    case 3:
                        int iIntValue = ((Integer) obj2).intValue();
                        f fVar4 = (f) this.f130327b.L();
                        if (fVar4 != null) {
                            ContainerActivity containerActivity = (ContainerActivity) fVar4;
                            containerActivity.f285752s0.a().setBackground(ContextCompat.getDrawable(containerActivity, iIntValue));
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        f fVar5 = (f) this.f130327b.L();
                        if (fVar5 != null) {
                            k.e(((ContainerActivity) fVar5).f285752s0.a(), zBooleanValue);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K4 = K();
        Function0 function0J4 = J();
        r rVarOnErrorResumeNext4 = bVar5.onErrorResumeNext(new a08.r(16, new q(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a0d.g(13, function14), new a0d.g(13, function1K4), new ea9.c(3, function0J4));
        w.j0(bVar2, cVarSubscribe4);
        Intrinsics.h(cVarSubscribe4);
        ihm.b bVar6 = aVar3.f315908h;
        final int i6 = 4;
        Function1 function15 = new Function1(this) { // from class: ewl.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f130327b;

            {
                this.f130327b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i6) {
                    case 0:
                        String title = (String) obj2;
                        Intrinsics.checkNotNullParameter(title, "it");
                        f fVar = (f) this.f130327b.L();
                        if (fVar != null) {
                            Intrinsics.checkNotNullParameter(title, "title");
                            ((ContainerActivity) fVar).f285752s0.b().setToolbarTitle(new TextClause(title, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj2;
                        num.intValue();
                        f fVar2 = (f) this.f130327b.L();
                        if (fVar2 != null) {
                            ((ContainerActivity) fVar2).f285752s0.b().setNavigationButtonIcon(num);
                        }
                        break;
                    case 2:
                        String text = (String) obj2;
                        Intrinsics.checkNotNullParameter(text, "it");
                        f fVar3 = (f) this.f130327b.L();
                        if (fVar3 != null) {
                            Intrinsics.checkNotNullParameter(text, "text");
                            ((ContainerActivity) fVar3).f285752s0.a().setText(text);
                        }
                        break;
                    case 3:
                        int iIntValue = ((Integer) obj2).intValue();
                        f fVar4 = (f) this.f130327b.L();
                        if (fVar4 != null) {
                            ContainerActivity containerActivity = (ContainerActivity) fVar4;
                            containerActivity.f285752s0.a().setBackground(ContextCompat.getDrawable(containerActivity, iIntValue));
                        }
                        break;
                    default:
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        f fVar5 = (f) this.f130327b.L();
                        if (fVar5 != null) {
                            k.e(((ContainerActivity) fVar5).f285752s0.a(), zBooleanValue);
                        }
                        break;
                }
                return Unit.f186387a;
            }
        };
        Function1 function1K5 = K();
        Function0 function0J5 = J();
        r rVarOnErrorResumeNext5 = bVar6.onErrorResumeNext(new a08.r(16, new q(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new a0d.g(13, function15), new a0d.g(13, function1K5), new ea9.c(3, function0J5));
        w.j0(bVar2, cVarSubscribe5);
        Intrinsics.h(cVarSubscribe5);
    }
}
