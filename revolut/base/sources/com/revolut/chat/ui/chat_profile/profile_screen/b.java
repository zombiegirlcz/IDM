package com.revolut.chat.ui.chat_profile.profile_screen;

import cli.y;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.domain.model.ChatMode;
import com.revolut.chat.ui.chat_profile.ChatProfileInputData;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreenContract$ModelStep;
import com.revolut.core.backend_flow.api.navigation.BackendFlowInput;
import com.revolut.data.model.Data;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.Map;
import java.util.UUID;
import k50.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;
import mqc.p;
import mra.d;
import n30.b0;
import n30.z;
import oki.h;
import ox5.d0;
import p40.i;
import p40.k;
import p40.l;
import p40.q;
import p40.r;
import p40.s;
import p50.j;
import p50.m;
import rf3.g;
import v30.w;
import vkm.j2;
import vkm.t1;
import vkm.z1;
import w50.u;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends h implements l {
    public final y A;
    public final com.revolut.kompot.navigable.vc.modal.a B;
    public final ChatProfileInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l40.a f51132p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k30.a f51133q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f51134r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f51135s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n0 f51136t;
    public final n30.y u;
    public final nf3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f51137w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z1 f51138x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t1 f51139y;
    public final boolean z;

    public b(ChatProfileInputData inputData, q profileScreenMapper, l40.a chatVoiceCallExtension, k30.a agentInteractor, z chatWebSocketInteractor, m uploadsPagingSource, n0 mediaExtension, n30.y chatProductSpecificInteractor, nf3.a chatAssistantResourcesConfig, u transcriptSelectionHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(profileScreenMapper, "profileScreenMapper");
        Intrinsics.checkNotNullParameter(chatVoiceCallExtension, "chatVoiceCallExtension");
        Intrinsics.checkNotNullParameter(agentInteractor, "agentInteractor");
        Intrinsics.checkNotNullParameter(chatWebSocketInteractor, "chatWebSocketInteractor");
        Intrinsics.checkNotNullParameter(uploadsPagingSource, "uploadsPagingSource");
        Intrinsics.checkNotNullParameter(mediaExtension, "mediaExtension");
        Intrinsics.checkNotNullParameter(chatProductSpecificInteractor, "chatProductSpecificInteractor");
        Intrinsics.checkNotNullParameter(chatAssistantResourcesConfig, "chatAssistantResourcesConfig");
        Intrinsics.checkNotNullParameter(transcriptSelectionHelper, "transcriptSelectionHelper");
        this.o = inputData;
        this.f51132p = chatVoiceCallExtension;
        this.f51133q = agentInteractor;
        this.f51134r = chatWebSocketInteractor;
        this.f51135s = uploadsPagingSource;
        this.f51136t = mediaExtension;
        this.u = chatProductSpecificInteractor;
        this.v = chatAssistantResourcesConfig;
        this.f51137w = transcriptSelectionHelper;
        boolean z = true;
        z1 z1VarB = vkm.q.b(1, 5, null);
        this.f51138x = z1VarB;
        this.f51139y = vkm.q.g(z1VarB);
        if (!(inputData.getF51124c() instanceof ChatMode.Feed) && !(inputData.getF51124c() instanceof ChatMode.SingleFeed)) {
            z = false;
        }
        this.z = z;
        this.A = d.b(this, new i(inputData.s0(), inputData.getF51123b(), inputData.getF51119a(), inputData.getF51122a(), inputData.getF51124c(), k.PHOTOS, z ? new Data(null, null, true, 3, null) : new Data(f0.f322471a, null, false, 2, null), z ? new Data(null, null, true, 3, null) : new Data(f0.f322471a, null, false, 2, null), z), profileScreenMapper, null, false, 12);
        this.B = e.a(this, new r(this, 0));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void I2(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -1449222315:
                if (listId.equals("BUTTON_SEARCH")) {
                    C2(o40.d.f221906a);
                    break;
                }
                break;
            case 240627547:
                if (listId.equals("BUTTON_FEEDBACK_FLOW")) {
                    int i = s.f232798a[((i) ((j2) this.A.f22677a).getValue()).f232776a.ordinal()];
                    ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM fullscreen_slide_from_bottom = ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a;
                    com.revolut.kompot.navigable.vc.modal.a aVar = this.B;
                    if (i == 1) {
                        ((g) this.u).getClass();
                        Intrinsics.checkNotNullParameter("air-profile-feedback", "formId");
                        h.v2(aVar, new ChatProfileScreenContract$ModelStep.FeedbackFlowStep(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "air-profile-feedback", null, null, 6)), fullscreen_slide_from_bottom);
                        break;
                    } else if (i == 2) {
                        h.v2(aVar, new ChatProfileScreenContract$ModelStep.FeedbackFlowStep(BackendFlowInput.Companion.a(BackendFlowInput.INSTANCE, "private-bank-banker-feedback-flow", null, null, 6)), fullscreen_slide_from_bottom);
                        break;
                    }
                }
                break;
            case 422592331:
                if (listId.equals("BUTTON_CALL")) {
                    ChatProfileInputData chatProfileInputData = this.o;
                    this.f51132p.f3(new l40.r(chatProfileInputData.getF51124c(), chatProfileInputData.s0(), chatProfileInputData.getD(), null));
                    break;
                }
                break;
            case 859605731:
                if (listId.equals("BUTTON_TRANSCRIPT")) {
                    n2(new a(this, null), new whi.b(6));
                    break;
                }
                break;
        }
    }

    public final void J2(w upload) {
        Intrinsics.checkNotNullParameter(upload, "upload");
        String strD = upload.d();
        UUID uuidC = upload.c();
        String strZ = upload.Z();
        String filePath = upload.getFilePath();
        Map mapA = upload.a();
        if (mapA == null) {
            mapA = r0.g();
        }
        this.f51136t.d3(strD, mapA, strZ, uuidC, filePath);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.B;
    }

    public final p50.k K2() {
        ChatProfileInputData chatProfileInputData = this.o;
        ChatMode f51124c = chatProfileInputData.getF51124c();
        if (f51124c instanceof ChatMode.SingleFeed) {
            return new j(chatProfileInputData.s0(), 2);
        }
        if (f51124c instanceof ChatMode.Feed) {
            return new p50.i(((ChatMode.Feed) f51124c).f51044a);
        }
        if (f51124c instanceof ChatMode.Default) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void T1(long j2) {
        UUID uuid;
        Continuation continuation = null;
        yji.l.b1(this, (SharedFlow) ((b0) this.f51134r).d.getValue(), null, new p(2, 18, null), 3);
        AgentInfo agentInfo = ((i) ((j2) this.A.f22677a).getValue()).f232778c;
        if (agentInfo != null && (uuid = agentInfo.f50997a) != null) {
            yji.l.b1(this, rd0.e.b(m70.a.g(this.f51133q.a(uuid), null, new d0(27), 1)), null, new p40.u(this, continuation, 1), 3);
        }
        if (this.z) {
            yji.l.b1(this, this.f51135s.j(0L), null, new p40.u(this, continuation, 0), 3);
            p50.k kVarK2 = K2();
            if (kVarK2 != null) {
                n2(new osk.m(this, kVarK2, continuation, 19), new whi.b(6));
            }
            yji.l.b1(this, this.f51139y, null, new omg.e(this, continuation, 20), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.A;
    }
}
