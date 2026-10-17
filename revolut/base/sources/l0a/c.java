package l0a;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ d B;
    public int C;
    public ChatTransferRecipient u;
    public Integer v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public TextLocalisedClause f191193w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ResourceImage f191194x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191195y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.B = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, this);
    }
}
