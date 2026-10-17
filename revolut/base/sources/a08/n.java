package a08;

import a5e.m;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.text.input.TextFieldValue;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.l6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.learn.shared.models.domain.LearnBlog;
import com.revolut.kompot.common.R$string;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ms0.h4;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203a;

    public /* synthetic */ n(int i) {
        this.f203a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        boolean z = false;
        switch (this.f203a) {
            case 0:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 1:
                Throwable error = (Throwable) obj2;
                zw7.d0 d0Var = (zw7.d0) obj3;
                Intrinsics.checkNotNullParameter(error, "error");
                if (d0Var != null) {
                    return error;
                }
                return null;
            case 2:
                w4l.f DataObservableDelegate = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 3:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List blogs = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(blogs, "blogs");
                throw null;
            case 4:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                List blogs2 = (List) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(blogs2, "blogs");
                throw null;
            case 5:
                w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                Intrinsics.checkNotNullParameter(null, "params");
                throw null;
            case 6:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                LearnBlog blog = (LearnBlog) obj3;
                Intrinsics.checkNotNullParameter(null, "params");
                Intrinsics.checkNotNullParameter(blog, "blog");
                throw null;
            case 7:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 8:
                Function1 getDefaultErrorItems = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems, "getDefaultErrorItems");
                return new a2f.i((List) getDefaultErrorItems.invoke(new iii.d(12, null, true, true, null)), null, null, null, false, null);
            case 9:
                ((Boolean) obj2).getClass();
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 11:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 12:
                return TextFieldValue.Saver$lambda$0((SaverScope) obj2, (TextFieldValue) obj3);
            case 13:
                Throwable error2 = (Throwable) obj2;
                List list = (List) obj3;
                Intrinsics.checkNotNullParameter(error2, "error");
                if (list == null) {
                    return error2;
                }
                return null;
            case 14:
                Throwable error3 = (Throwable) obj2;
                List list2 = (List) obj3;
                Intrinsics.checkNotNullParameter(error3, "error");
                if (list2 == null) {
                    return error3;
                }
                return null;
            case 15:
                Throwable error4 = (Throwable) obj2;
                List list3 = (List) obj3;
                Intrinsics.checkNotNullParameter(error4, "error");
                if (list3 == null) {
                    return error4;
                }
                return null;
            case 16:
                Function1 getDefaultErrorItems2 = (Function1) obj3;
                Intrinsics.checkNotNullParameter(getDefaultErrorItems2, "getDefaultErrorItems");
                return new a32.q((List) getDefaultErrorItems2.invoke(new iii.d(14, null, true, false, null)), false);
            case 17:
                Throwable error5 = (Throwable) obj2;
                Boolean bool = (Boolean) obj3;
                Intrinsics.checkNotNullParameter(error5, "error");
                if (bool == null) {
                    return error5;
                }
                return null;
            case 18:
                if (((Boolean) obj2).booleanValue()) {
                    return null;
                }
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 19:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 20:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                FullScreenStateDelegate.Model model = new FullScreenStateDelegate.Model("STORE_DEALS_ERROR_STATE", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, new l6(12, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), null, h4.ACCENT), null, false, null, null, null, 2028);
                int i = R$attr.uikit_dp32;
                int i2 = R$attr.uikit_dp8;
                yp0.b.l(model, i, i, i2, i2, null, false, 48);
                return zhm.u.c(model);
            case 21:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.h0.f322473a;
            case 22:
                ((Boolean) obj2).booleanValue();
                a4b.c.Companion.getClass();
                return a4b.b.f1234b;
            case 23:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                return null;
            case 24:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return a4b.o.f1248a;
            case 25:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            case 26:
                Data data = (Data) obj2;
                Data data2 = (Data) obj3;
                wel.e eVar = (wel.e) org.bouncycastle.jcajce.provider.digest.a.m(data, data2, "old", "new");
                wel.i iVar = eVar != null ? eVar.f296819b : null;
                wel.e eVar2 = (wel.e) data2.getContent();
                if (iVar == (eVar2 != null ? eVar2.f296819b : null) && Intrinsics.f(data.getError(), data2.getError()) && data.getLoading() == data2.getLoading()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                Function1 defaultErrorItemsAccessor = (Function1) obj3;
                Intrinsics.checkNotNullParameter(defaultErrorItemsAccessor, "defaultErrorItemsAccessor");
                return (List) defaultErrorItemsAccessor.invoke(new iii.d(14, null, false, false, null));
            case 28:
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
            default:
                m.a aVar = a5e.m.Companion;
                Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
                return zhm.f0.f322471a;
        }
    }

    public /* synthetic */ n(Object obj2, int i) {
        this.f203a = i;
    }
}
