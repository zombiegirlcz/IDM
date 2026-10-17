package tv;

import com.revolut.camerakit.client.api.R$string;
import com.revolut.core.ui_kit_resources.R$drawable;

/* JADX INFO: loaded from: classes16.dex */
public final class f extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f274643a = R$string.autocapture_document_hint_position_document_front;

    @Override // tv.c, tv.j
    public final i c() {
        return new i(Integer.valueOf(R$string.autocapture_document_hint_tilt_forward), Integer.valueOf(R$string.autocapture_document_hint_tilt_forward_suggestion), m.GUIDANCE, Integer.valueOf(R$drawable.uikit_icn_24_arrow_top_down));
    }

    @Override // tv.c
    public final int d() {
        return this.f274643a;
    }
}
