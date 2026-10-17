package com.revolut.feature.junior.accounts.models;

import com.revolut.feature.junior.accounts.models.JuniorAccountPayload;
import com.revolut.feature.junior.accounts.models.JuniorAccountShownPayload;
import com.revolut.feature.junior.accounts.models.JuniorGraduationBottomSheetPayload;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import mlm.f;
import org.jetbrains.annotations.NotNull;
import rlm.g;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003\u0082\u0001\u0004\u0004\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior/accounts/models/JuniorPayload;", "Lcom/revolut/feature/tab/accounts/models/ProductAccountId$Payload;", "Companion", "a", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountPayload;", "Lcom/revolut/feature/junior/accounts/models/JuniorAccountShownPayload;", "Lcom/revolut/feature/junior/accounts/models/JuniorGraduationBottomSheetPayload;", "Lcom/revolut/feature/junior/accounts/models/JuniorProductAccountIdPayload;", "feature_junior_accounts_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g(discriminator = "juniorPayloadType")
@mlm.g
public interface JuniorPayload extends ProductAccountId.Payload {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f76716a;

    /* JADX INFO: renamed from: com.revolut.feature.junior.accounts.models.JuniorPayload$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f76716a = new Companion();

        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            p0 p0Var = o0.f186429a;
            return new f("com.revolut.feature.junior.accounts.models.JuniorPayload", p0Var.b(JuniorPayload.class), new KClass[]{p0Var.b(JuniorAccountPayload.AccountClose.class), p0Var.b(JuniorAccountPayload.AccountClosed.class), p0Var.b(JuniorAccountShownPayload.GraduationPendingDialog.class), p0Var.b(JuniorGraduationBottomSheetPayload.class), p0Var.b(JuniorProductAccountIdPayload.class)}, new KSerializer[]{JuniorAccountPayload.AccountClose.a.f76708a, JuniorAccountPayload.AccountClosed.a.f76711a, JuniorAccountShownPayload.GraduationPendingDialog.a.f76713a, JuniorGraduationBottomSheetPayload.a.f76715a, JuniorProductAccountIdPayload.a.f76719a}, new Annotation[]{new a()});
        }
    }
}
