package mx0;

import android.view.View;
import com.revolut.core.ui_kit.views.CenteredAmountView;
import com.revolut.core.ui_kit.views.IdDocumentView;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e3 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ihm.f f209672b;

    public /* synthetic */ e3(ihm.f fVar, int i) {
        this.f209671a = i;
        this.f209672b = fVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f209671a;
        ihm.f fVar = this.f209672b;
        switch (i) {
            case 0:
                GlyphImage glyphImage = CenteredAmountView.G;
                fVar.onNext(Unit.f186387a);
                break;
            case 1:
                GlyphImage glyphImage2 = CenteredAmountView.G;
                fVar.onNext(Unit.f186387a);
                break;
            case 2:
                IdDocumentView.a aVar = IdDocumentView.Companion;
                fVar.onNext(Unit.f186387a);
                break;
            default:
                IdDocumentView.a aVar2 = IdDocumentView.Companion;
                fVar.onNext(Unit.f186387a);
                break;
        }
    }
}
