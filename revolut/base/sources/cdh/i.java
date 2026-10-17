package cdh;

import com.revolut.core.ui_kit.delegates.widgets.ErrorWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.functions.Function1;
import op0.q;
import org.bouncycastle.asn1.BERTags;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f23256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f23257b;

    public i(j jVar, String str) {
        this.f23256a = jVar;
        this.f23257b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        CdnImage cdnImageC = com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30);
        w0h.f fVar = this.f23256a.f23258b;
        TextLocalisedClause textLocalisedClauseG = fVar.g();
        q qVar = q.LARGE;
        return new go.g(new ErrorWidgetDelegate.Model(this.f23257b, cdnImageC, textLocalisedClauseG, fVar.f(), qVar, null, null, BERTags.FLAGS), 2);
    }
}
