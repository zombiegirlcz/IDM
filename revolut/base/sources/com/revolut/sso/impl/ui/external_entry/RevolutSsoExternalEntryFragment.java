package com.revolut.sso.impl.ui.external_entry;

import android.content.Intent;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowContract$InputData;
import com.revolut.sso.impl.ui.external_entry.external_entry.ExternalEntryFlowImpl;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import p.a;
import rd0.c;
import vji.b;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/external_entry/RevolutSsoExternalEntryFragment;", "Lcom/revolut/kompot/entry_point/fragment/KompotFragment;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutSsoExternalEntryFragment extends KompotFragment {
    @Override // com.revolut.kompot.entry_point.fragment.KompotFragment
    public final b z() {
        ExternalEntryFlowContract$InputData externalEntryFlowContract$InputData;
        Intent intent = requireActivity().getIntent();
        String stringExtra = intent.getStringExtra("EXTRA_KEY_FLOW_TO_LAUNCH");
        if (Intrinsics.f(stringExtra, "GET_AUTH_CODE")) {
            String stringExtra2 = intent.getStringExtra("EXTRA_KEY_SESSION_ID");
            String stringExtra3 = intent.getStringExtra("EXTRA_KEY_AUTH_CODE_CHALLENGE");
            if (stringExtra3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String stringExtra4 = intent.getStringExtra("EXTRA_KEY_AUTH_CLIENT_ID");
            if (stringExtra4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_KEY_AUTH_SECURITY_PROFILES");
            if (stringArrayExtra == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            externalEntryFlowContract$InputData = new ExternalEntryFlowContract$InputData(new ExternalEntryFlowContract$InputData.FlowToLaunch.GetAuthCode(stringExtra3, stringExtra4, intent.getStringExtra("EXTRA_KEY_AUTH_STATE"), stringExtra2, d.v0(stringArrayExtra)));
        } else {
            Intrinsics.checkNotNullExpressionValue("RevolutSsoExternalEntryFragment", "getSimpleName(...)");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, "RevolutSsoExternalEntryFragment", a.p("Flow ", stringExtra, " is not supported"), null, h0Var);
            externalEntryFlowContract$InputData = new ExternalEntryFlowContract$InputData(ExternalEntryFlowContract$InputData.FlowToLaunch.NotSupported.f106544a);
        }
        return new b(new ExternalEntryFlowImpl(externalEntryFlowContract$InputData), null, false, 30);
    }
}
