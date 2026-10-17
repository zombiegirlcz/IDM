package b8d;

import com.revolut.feature.shared.help_centre.impl.utils.FaqNotFoundException;
import com.revolut.feature.shared.help_centre.impl.utils.FaqNotLoadedException;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.shared.help_centre.impl.faq.screens.article.c f13158a;

    public e0(com.revolut.feature.shared.help_centre.impl.faq.screens.article.c cVar) {
        this.f13158a = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) throws FaqNotLoadedException, FaqNotFoundException {
        String faqKey = this.f13158a.f86243y;
        Intrinsics.checkNotNullParameter((Function1) obj3, "<unused var>");
        if (!(((Throwable) obj2) instanceof NoSuchElementException)) {
            FaqNotLoadedException.INSTANCE.getClass();
            FaqNotLoadedException.Companion.a(faqKey);
            throw null;
        }
        FaqNotFoundException.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
        FaqNotFoundException faqNotFoundException = new FaqNotFoundException(faqKey);
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, faqNotFoundException, h0Var);
        throw faqNotFoundException;
    }
}
