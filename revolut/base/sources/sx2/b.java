package sx2;

import android.content.Context;
import android.content.res.Configuration;
import androidx.core.app.ActivityCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.revolut.feature.card_design.impl.card_design.carousel.CardDesignCarouselController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f266267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CardDesignCarouselController f266268b;

    public /* synthetic */ b(CardDesignCarouselController cardDesignCarouselController, int i) {
        this.f266267a = i;
        this.f266268b = cardDesignCarouselController;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f266267a;
        CardDesignCarouselController cardDesignCarouselController = this.f266268b;
        switch (i) {
            case 0:
                Configuration it8 = (Configuration) obj2;
                CardDesignCarouselController.a aVar = CardDesignCarouselController.Companion;
                Intrinsics.checkNotNullParameter(it8, "it");
                if (((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
                    ActivityCompat.recreate(cardDesignCarouselController.m2());
                }
                return Unit.f186387a;
            default:
                Context it9 = (Context) obj2;
                CardDesignCarouselController.a aVar2 = CardDesignCarouselController.Companion;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new LinearLayoutManager(cardDesignCarouselController.m2(), 1, false);
        }
    }
}
