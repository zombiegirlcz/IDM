package c8j;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import go.g;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import yji.n;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b extends n {

    public static final class a extends b {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f22237l = new a();

        private a() {
        }

        @Override // c8j.b
        public final Flow Z2(xi0.b currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            return new g(f0.f322471a, 2);
        }

        @Override // c8j.b
        public final void b3(CellDetailsActionDelegate.Model model) {
            Intrinsics.checkNotNullParameter(model, "model");
        }
    }

    public abstract Flow Z2(xi0.b bVar);

    public abstract void b3(CellDetailsActionDelegate.Model model);
}
