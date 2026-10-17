package ry7;

import com.revolut.feature.insurance_pet.impl.ui.edit.planeditor.PetEditQuoteContract$CoPaySelection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f258244a = new g();

    public g() {
        super(1, zi0.c.class, "toData", "toData(Ljava/lang/Object;ZLjava/lang/Throwable;)Lcom/revolut/data/model/Data;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        PetEditQuoteContract$CoPaySelection p0 = (PetEditQuoteContract$CoPaySelection) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return zi0.c.P(p0, false, null, 3);
    }
}
