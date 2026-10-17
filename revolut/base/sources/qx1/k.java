package qx1;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.ApmDescriptor;
import com.revolut.feature.apm.core.models.recipients.ApmIdentifier;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import com.revolut.feature.apm.core.models.recipients.BlikContact;
import com.revolut.feature.apm.core.models.recipients.MultibancoContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public abstract class k {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.revolut.feature.apm.core.models.recipients.ApmContact$SimpleState] */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.revolut.feature.apm.core.models.recipients.ApmContact$SimpleState] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.revolut.feature.apm.core.models.recipients.ApmContact$SimpleState] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final ApmContact a(c cVar) {
        ?? r152;
        ?? r153;
        ApmDescriptor.Phone phone;
        ApmContact.State state;
        ?? r154;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String type = cVar.getType();
        int iHashCode = type.hashCode();
        ApmContact.State state2 = ApmContact.State.DELETED.f62100a;
        ApmContact.State.ACTIVE active = ApmContact.State.ACTIVE.f62099a;
        switch (iHashCode) {
            case 2041580:
                if (type.equals("BLIK")) {
                    if (cVar.getPhone() == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("APM BLIK Contact should have phone");
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                        return null;
                    }
                    ApmIdentifier.Uuid uuid = new ApmIdentifier.Uuid(cVar.getId());
                    ApmDescriptor.Phone phone2 = new ApmDescriptor.Phone(cVar.getPhone());
                    String contactName = cVar.getContactName();
                    String alias = cVar.getAlias();
                    String state3 = cVar.getState();
                    if (Intrinsics.f(state3, "ACTIVE")) {
                        r152 = active;
                    } else {
                        if (!Intrinsics.f(state3, "DELETED")) {
                            throw new IllegalStateException(j6.a.q("Unknown BlikContact discovery state: ", cVar.getState()));
                        }
                        if (cVar.getAlias() == null) {
                            IllegalStateException illegalStateException2 = new IllegalStateException("BlikContact DELETED state without id/alias");
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                            return null;
                        }
                        r152 = state2;
                    }
                    return new BlikContact(uuid, phone2, contactName, alias, null, r152);
                }
                break;
            case 2551874:
                if (type.equals("SPIN")) {
                    if (cVar.getPhone() == null) {
                        IllegalStateException illegalStateException3 = new IllegalStateException("APM SPIN Contact should have phone");
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                        return null;
                    }
                    ApmIdentifier.Uuid uuid2 = new ApmIdentifier.Uuid(cVar.getId());
                    ApmDescriptor.Phone phone3 = new ApmDescriptor.Phone(cVar.getPhone());
                    String contactName2 = cVar.getContactName();
                    String alias2 = cVar.getAlias();
                    String state4 = cVar.getState();
                    if (Intrinsics.f(state4, "ACTIVE")) {
                        r153 = active;
                    } else {
                        if (!Intrinsics.f(state4, "DELETED")) {
                            throw new IllegalStateException(j6.a.q("Unknown SpinContact discovery state: ", cVar.getState()));
                        }
                        r153 = state2;
                    }
                    return new SpinContact(uuid2, phone3, contactName2, alias2, null, r153, null);
                }
                break;
            case 63216331:
                if (type.equals("BIZUM")) {
                    ApmIdentifier.Uuid uuid3 = new ApmIdentifier.Uuid(cVar.getId());
                    if (cVar.getPhone() != null) {
                        phone = new ApmDescriptor.Phone(cVar.getPhone());
                    } else {
                        if (cVar.getEmail() == null) {
                            Intrinsics.checkNotNullParameter(cVar, "<this>");
                            throw new mx1.b("No descriptor found for: " + cVar);
                        }
                        phone = new ApmDescriptor.Phone(cVar.getEmail());
                    }
                    ApmDescriptor.Phone phone4 = phone;
                    String alias3 = cVar.getAlias();
                    String contactName3 = cVar.getContactName();
                    String state5 = cVar.getState();
                    int iHashCode2 = state5.hashCode();
                    if (iHashCode2 != -2026521607) {
                        if (iHashCode2 != -526380146) {
                            if (iHashCode2 == 1925346054 && state5.equals("ACTIVE")) {
                                state = active;
                            }
                        } else if (state5.equals("NOT_REGISTERED")) {
                            state2 = ApmContact.State.NOT_REGISTERED.f62101a;
                            state = state2;
                        }
                        throw new IllegalStateException(j6.a.q("Unknown BizumContact discovery state: ", cVar.getState()));
                    }
                    if (state5.equals("DELETED")) {
                        if (cVar.getAlias() == null) {
                            IllegalStateException illegalStateException4 = new IllegalStateException("BizumContact DELETED state without id/alias");
                            h0 h0Var4 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException4, h0Var4);
                            return null;
                        }
                        state = state2;
                    }
                    throw new IllegalStateException(j6.a.q("Unknown BizumContact discovery state: ", cVar.getState()));
                    return new BizumContact(uuid3, phone4, contactName3, alias3, null, state);
                }
                break;
            case 1736913698:
                if (type.equals("MULTIBANCO")) {
                    if (cVar.getPhone() == null) {
                        IllegalStateException illegalStateException5 = new IllegalStateException("APM MB Contact should have phone");
                        h0 h0Var5 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException5, h0Var5);
                        return null;
                    }
                    ApmIdentifier.Uuid uuid4 = new ApmIdentifier.Uuid(cVar.getId());
                    ApmDescriptor.Phone phone5 = new ApmDescriptor.Phone(cVar.getPhone());
                    String contactName4 = cVar.getContactName();
                    String alias4 = cVar.getAlias();
                    String state6 = cVar.getState();
                    if (Intrinsics.f(state6, "ACTIVE")) {
                        r154 = active;
                    } else {
                        if (!Intrinsics.f(state6, "DELETED")) {
                            throw new IllegalStateException(j6.a.q("Unknown MultibancoContact discovery state: ", cVar.getState()));
                        }
                        r154 = state2;
                    }
                    return new MultibancoContact(uuid4, phone5, contactName4, alias4, null, r154);
                }
                break;
        }
        throw new IllegalStateException(j6.a.q("Unknown ApmContact Type: ", cVar.getType()));
    }
}
