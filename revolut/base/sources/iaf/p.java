package iaf;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferInSelectedAsset;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f160013b;

    public /* synthetic */ p(r rVar, int i) {
        this.f160012a = i;
        this.f160013b = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        final s9f.c output = (s9f.c) obj2;
        switch (this.f160012a) {
            case 0:
                Intrinsics.checkNotNullParameter(output, "output");
                if (output == null) {
                    throw new NoWhenBranchMatchedException();
                }
                final r rVar = this.f160013b;
                final int i = 0;
                rVar.H2(rVar.f160018r, new Function1(rVar, output, i) { // from class: iaf.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f160014a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s9f.c f160015b;

                    {
                        this.f160014a = i;
                        this.f160015b = output;
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        j update = (j) obj3;
                        switch (this.f160014a) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ?? r06 = update.f160003a;
                                TransferInSelectedAsset transferInSelectedAsset = this.f160015b.f261174a;
                                LinkedHashMap linkedHashMapZ = r0.z(r06);
                                linkedHashMapZ.put(transferInSelectedAsset.f91510a.f91506a, transferInSelectedAsset);
                                return j.a(update, linkedHashMapZ, true, 2);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ?? r09 = update.f160003a;
                                TransferInSelectedAsset transferInSelectedAsset2 = this.f160015b.f261174a;
                                LinkedHashMap linkedHashMapZ2 = r0.z(r09);
                                linkedHashMapZ2.put(transferInSelectedAsset2.f91510a.f91506a, transferInSelectedAsset2);
                                return j.a(update, linkedHashMapZ2, true, 2);
                        }
                    }
                });
                return Unit.f186387a;
            default:
                Intrinsics.checkNotNullParameter(output, "output");
                if (output == null) {
                    throw new NoWhenBranchMatchedException();
                }
                final r rVar2 = this.f160013b;
                final int i2 = 1;
                rVar2.H2(rVar2.f160018r, new Function1(rVar2, output, i2) { // from class: iaf.q

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f160014a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ s9f.c f160015b;

                    {
                        this.f160014a = i2;
                        this.f160015b = output;
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
                    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        j update = (j) obj3;
                        switch (this.f160014a) {
                            case 0:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ?? r06 = update.f160003a;
                                TransferInSelectedAsset transferInSelectedAsset = this.f160015b.f261174a;
                                LinkedHashMap linkedHashMapZ = r0.z(r06);
                                linkedHashMapZ.put(transferInSelectedAsset.f91510a.f91506a, transferInSelectedAsset);
                                return j.a(update, linkedHashMapZ, true, 2);
                            default:
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                ?? r09 = update.f160003a;
                                TransferInSelectedAsset transferInSelectedAsset2 = this.f160015b.f261174a;
                                LinkedHashMap linkedHashMapZ2 = r0.z(r09);
                                linkedHashMapZ2.put(transferInSelectedAsset2.f91510a.f91506a, transferInSelectedAsset2);
                                return j.a(update, linkedHashMapZ2, true, 2);
                        }
                    }
                });
                return Unit.f186387a;
        }
    }
}
