package u38;

import com.revolut.feature.joint.api.models.JointDeeplink;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {
    private e() {
    }

    public static JointDeeplink a(jf0.c cVar) {
        String str;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String strE = cVar.e(1);
        int iHashCode = strE.hashCode();
        xi0.b bVarA = null;
        if (iHashCode != 853600045) {
            if (iHashCode != 1332762497) {
                if (iHashCode == 1421046217 && strE.equals("joint-accounts")) {
                    String strE2 = cVar.e(2);
                    HashMap map = cVar.d;
                    String strE3 = cVar.e(3);
                    String strE4 = cVar.e(4);
                    if (Intrinsics.f(strE2, "invitations") && Intrinsics.f(strE3, "remind") && !d0.W(strE4)) {
                        return new JointDeeplink.InvitationRemind(strE4);
                    }
                    boolean zF = Intrinsics.f(strE2, "invitation-mcy");
                    JointDeeplink.Home home = JointDeeplink.Home.f76472a;
                    if (zF) {
                        String str2 = (String) map.get("pocketType");
                        if (str2 != null && (str = (String) map.get("currency")) != null) {
                            xi0.b.Companion.getClass();
                            return new JointDeeplink.InvitationMcy(str2, (String) map.get("pocketName"), xi0.a.a(str));
                        }
                    } else if (!Intrinsics.f(strE2, "home")) {
                        if (Intrinsics.f(strE2, "account") && !d0.W(strE3)) {
                            return new JointDeeplink.AccountId(strE3);
                        }
                        if (Intrinsics.f(strE2, "card-order-selection")) {
                            return new JointDeeplink.CardOrderingSelection(cVar.l());
                        }
                        if (Intrinsics.f(strE2, "card-ordering")) {
                            return JointDeeplink.CardOrdering.f76468a;
                        }
                        if (Intrinsics.f(strE2, "first-purchase")) {
                            return JointDeeplink.FirstPurchase.f76471a;
                        }
                        if (Intrinsics.f(strE2, "savings") && Intrinsics.f(strE3, "account-closed")) {
                            String str3 = (String) map.get("user");
                            String str4 = (String) map.get("name");
                            if (str4 != null && str3 != null) {
                                return new JointDeeplink.SavingsClosed(str3, str4);
                            }
                            IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Both params are required: accountName = ", str4, " ; initiator = ", str3));
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                            return home;
                        }
                        if (Intrinsics.f(strE2, "subaccounts") && Intrinsics.f(strE3, "account-closed")) {
                            String str5 = (String) map.get("user_name");
                            String str6 = (String) map.get("pocket_name");
                            if (str6 != null && str5 != null) {
                                return new JointDeeplink.SubaccountClosed(str5, str6);
                            }
                            IllegalStateException illegalStateException2 = new IllegalStateException(a0.d.s("Both params are required: accountName = ", str6, " ; initiator = ", str5));
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                            return home;
                        }
                        if (Intrinsics.f(strE2, "savings") && Intrinsics.f(strE3, "create")) {
                            return JointDeeplink.SavingsCreate.f76480a;
                        }
                        if (Intrinsics.f(strE2, "card-google-pay")) {
                            return new JointDeeplink.CardToGooglePay(cVar.l());
                        }
                    }
                    return home;
                }
            } else if (strE.equals("topup-joint-method")) {
                String strE5 = cVar.e(2);
                if (d0.W(strE5)) {
                    strE5 = null;
                }
                if (strE5 != null) {
                    xi0.b.Companion.getClass();
                    bVarA = xi0.a.a(strE5);
                }
                return new JointDeeplink.TopUpMethods(bVarA);
            }
        } else if (strE.equals("topup-joint")) {
            String strE6 = cVar.e(2);
            if (d0.W(strE6)) {
                strE6 = null;
            }
            if (strE6 != null) {
                xi0.b.Companion.getClass();
                bVarA = xi0.a.a(strE6);
            }
            return new JointDeeplink.TopUp(bVarA, cVar.l());
        }
        return null;
    }
}
