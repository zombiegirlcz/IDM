package ofj;

import com.revolut.retail.feature.esim.api.model.EsimDescriptorValue;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberOption;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberTiers;
import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import com.revolut.retail.feature.esim.api.model.EsimMobilePlanPointsOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttribute;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingAttributesValidation;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingContractType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingInstruction;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingScheduleOption;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionOptions;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsFee;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelectionsLimits;
import com.revolut.retail.feature.esim.api.model.EsimPortingContractTypeCode;
import com.revolut.retail.feature.esim.api.model.EsimRandomPhoneNumberOption;
import dej.f0;
import dej.g0;
import dej.t0;
import dej.u0;
import dej.z0;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kfj.c2;
import kfj.d2;
import kfj.e0;
import kfj.e2;
import kfj.f2;
import kfj.j1;
import kfj.k1;
import kfj.l1;
import kfj.n1;
import kfj.p1;
import kfj.r;
import kfj.s1;
import kfj.w1;
import kfj.x;
import kfj.y1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0994  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x017b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0264 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x03f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0997 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPowerOfAttorneyInfo] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r12v5, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingDynamicForm] */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOtp] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v19, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v114 */
    /* JADX WARN: Type inference failed for: r1v115, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v118 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v142 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v50, types: [com.revolut.retail.feature.esim.api.model.EsimHyperText] */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [com.revolut.retail.feature.esim.api.model.EsimHyperText] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingCredentialIssuer] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v101, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v105, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v106, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v122 */
    /* JADX WARN: Type inference failed for: r2v123 */
    /* JADX WARN: Type inference failed for: r2v124, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v126, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v136, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v147 */
    /* JADX WARN: Type inference failed for: r2v148 */
    /* JADX WARN: Type inference failed for: r2v149 */
    /* JADX WARN: Type inference failed for: r2v150 */
    /* JADX WARN: Type inference failed for: r2v151 */
    /* JADX WARN: Type inference failed for: r2v152 */
    /* JADX WARN: Type inference failed for: r2v153 */
    /* JADX WARN: Type inference failed for: r2v17, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v54, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r2v68, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r2v82, types: [com.revolut.retail.feature.esim.api.model.EsimHyperText] */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2, types: [dej.a1] */
    /* JADX WARN: Type inference failed for: r35v3 */
    /* JADX WARN: Type inference failed for: r35v4 */
    /* JADX WARN: Type inference failed for: r35v5, types: [dej.a1] */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [dej.a1] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2, types: [com.revolut.retail.feature.esim.api.model.EsimHyperText] */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r3v10, types: [dej.a1[]] */
    /* JADX WARN: Type inference failed for: r3v18, types: [dej.a1[]] */
    /* JADX WARN: Type inference failed for: r3v29, types: [dej.a1[]] */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r43v0 */
    /* JADX WARN: Type inference failed for: r43v1, types: [com.revolut.retail.feature.esim.api.model.EsimHyperText] */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r43v5 */
    /* JADX WARN: Type inference failed for: r44v0 */
    /* JADX WARN: Type inference failed for: r44v1, types: [com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingSwitchStrategy] */
    /* JADX WARN: Type inference failed for: r44v2 */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r44v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v5 */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v13, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v54, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r4v55, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v20, types: [dej.v0[]] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v80 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r7v22, types: [dej.x0[]] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [dej.a1] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting a(kfj.n1 r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.k.a(kfj.n1):com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting");
    }

    public static final EsimPhoneNumberPortingAttribute b(j1 j1Var) {
        EsimHyperText esimHyperText;
        List arrayList;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        String key = j1Var.getKey();
        String label = j1Var.getLabel();
        String hint = j1Var.getHint();
        e0 caption = j1Var.getCaption();
        int i = 0;
        u0 u0Var = null;
        if (caption != null) {
            String text = caption.getText();
            List<r> descriptors = caption.getDescriptors();
            ArrayList arrayList2 = new ArrayList();
            for (r rVar : descriptors) {
                String text2 = rVar.getText();
                if (rVar.getAction() != null) {
                    f0[] f0VarArrValues = f0.values();
                    if (f0VarArrValues.length > 0) {
                        f0 f0Var = f0VarArrValues[0];
                        throw null;
                    }
                }
                String url2 = rVar.getUrl();
                EsimHyperText.Descriptor descriptor = url2 != null ? new EsimHyperText.Descriptor(text2, new EsimDescriptorValue.Link(url2)) : null;
                if (descriptor != null) {
                    arrayList2.add(descriptor);
                }
            }
            List<String> parameters = caption.getParameters();
            if (parameters != null) {
                arrayList = new ArrayList();
                for (String str : parameters) {
                    g0[] g0VarArrValues = g0.values();
                    if (g0VarArrValues.length > 0) {
                        g0 g0Var = g0VarArrValues[0];
                        throw null;
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                arrayList = zhm.f0.f322471a;
            }
            esimHyperText = new EsimHyperText(text, arrayList2, arrayList);
        } else {
            esimHyperText = null;
        }
        String dataType = j1Var.getDataType();
        u0[] u0VarArrValues = u0.values();
        int length = u0VarArrValues.length;
        while (true) {
            if (i >= length) {
                break;
            }
            u0 u0Var2 = u0VarArrValues[i];
            if (a0.z(u0Var2.name(), dataType, true)) {
                u0Var = u0Var2;
                break;
            }
            i++;
        }
        if (u0Var == null) {
            u0Var = u0.UNKNOWN;
        }
        String mask = j1Var.getMask();
        k1 validation = j1Var.getValidation();
        Intrinsics.checkNotNullParameter(validation, "<this>");
        return new EsimPhoneNumberPortingAttribute(key, label, hint, esimHyperText, u0Var, mask, new EsimPhoneNumberPortingAttributesValidation(validation.getRegex(), validation.getRequired(), validation.getMinLength(), validation.getMaxLength()));
    }

    public static final EsimPhoneNumberPortingContractType c(l1 l1Var) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(l1Var, "<this>");
        EsimPortingContractTypeCode.Companion companion = EsimPortingContractTypeCode.INSTANCE;
        String raw = l1Var.getType();
        companion.getClass();
        Intrinsics.checkNotNullParameter(raw, "raw");
        String value = d0.F0(raw).toString();
        Intrinsics.checkNotNullParameter(value, "value");
        String text = l1Var.getText();
        String description = l1Var.getDescription();
        List preferredScheduleOptions = l1Var.getPreferredScheduleOptions();
        ArrayList arrayList2 = new ArrayList(w.t(preferredScheduleOptions, 10));
        Iterator it8 = preferredScheduleOptions.iterator();
        while (it8.hasNext()) {
            arrayList2.add(g((y1) it8.next()));
        }
        List additionalAttributes = l1Var.getAdditionalAttributes();
        if (additionalAttributes != null) {
            List list = additionalAttributes;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it9 = list.iterator();
            while (it9.hasNext()) {
                arrayList.add(b((j1) it9.next()));
            }
        } else {
            arrayList = null;
        }
        return new EsimPhoneNumberPortingContractType(value, text, description, arrayList2, arrayList);
    }

    public static final EsimPhoneNumberPortingInstruction d(p1 p1Var) {
        Intrinsics.checkNotNullParameter(p1Var, "<this>");
        String icon = p1Var.getIcon();
        String title = p1Var.getTitle();
        e0 content = p1Var.getContent();
        String text = content.getText();
        List descriptors = content.getDescriptors();
        ArrayList arrayList = new ArrayList();
        Iterator it8 = descriptors.iterator();
        while (true) {
            List list = null;
            if (!it8.hasNext()) {
                List<String> parameters = content.getParameters();
                if (parameters != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str : parameters) {
                        g0[] g0VarArrValues = g0.values();
                        if (g0VarArrValues.length > 0) {
                            g0 g0Var = g0VarArrValues[0];
                            throw null;
                        }
                    }
                    list = arrayList2;
                }
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                return new EsimPhoneNumberPortingInstruction(new EsimHyperText(text, arrayList, list), icon, title);
            }
            r rVar = (r) it8.next();
            String text2 = rVar.getText();
            if (rVar.getAction() != null) {
                f0[] f0VarArrValues = f0.values();
                if (f0VarArrValues.length > 0) {
                    f0 f0Var = f0VarArrValues[0];
                    throw null;
                }
            }
            String url2 = rVar.getUrl();
            EsimHyperText.Descriptor descriptor = url2 != null ? new EsimHyperText.Descriptor(text2, new EsimDescriptorValue.Link(url2)) : null;
            if (descriptor != null) {
                arrayList.add(descriptor);
            }
        }
    }

    public static final EsimPhoneNumberPortingOwnerAccountType e(s1 s1Var) {
        ArrayList arrayList;
        t0 t0Var;
        Intrinsics.checkNotNullParameter(s1Var, "<this>");
        String type = s1Var.getType();
        t0[] t0VarArrValues = t0.values();
        int length = t0VarArrValues.length;
        int i = 0;
        while (true) {
            arrayList = null;
            if (i >= length) {
                t0Var = null;
                break;
            }
            t0Var = t0VarArrValues[i];
            if (a0.z(t0Var.name(), type, true)) {
                break;
            }
            i++;
        }
        if (t0Var == null) {
            t0Var = t0.UNKNOWN;
        }
        List attributes = s1Var.getAttributes();
        if (attributes != null) {
            List list = attributes;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((j1) it8.next()));
            }
        }
        return new EsimPhoneNumberPortingOwnerAccountType(t0Var, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule f(kfj.w1 r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = r14.getTitle()
            kfj.e0 r14 = r14.getSubtitle()
            java.lang.String r1 = r14.getText()
            java.util.List r2 = r14.getDescriptors()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L20:
            boolean r4 = r2.hasNext()
            r5 = 0
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L70
            java.lang.Object r4 = r2.next()
            kfj.r r4 = (kfj.r) r4
            java.lang.String r8 = r4.getText()
            java.lang.String r9 = r4.getAction()
            if (r9 == 0) goto L59
            dej.w0[] r10 = dej.w0.values()
            int r11 = r10.length
        L3e:
            if (r5 >= r11) goto L50
            r12 = r10[r5]
            java.lang.String r13 = r12.name()
            boolean r13 = kotlin.text.a0.z(r13, r9, r7)
            if (r13 == 0) goto L4d
            goto L51
        L4d:
            int r5 = r5 + 1
            goto L3e
        L50:
            r12 = r6
        L51:
            if (r12 == 0) goto L59
            com.revolut.retail.feature.esim.api.model.EsimDescriptorValue$Action r4 = new com.revolut.retail.feature.esim.api.model.EsimDescriptorValue$Action
            r4.<init>(r12)
            goto L65
        L59:
            java.lang.String r4 = r4.getUrl()
            if (r4 == 0) goto L6a
            com.revolut.retail.feature.esim.api.model.EsimDescriptorValue$Link r5 = new com.revolut.retail.feature.esim.api.model.EsimDescriptorValue$Link
            r5.<init>(r4)
            r4 = r5
        L65:
            com.revolut.retail.feature.esim.api.model.EsimHyperText$Descriptor r6 = new com.revolut.retail.feature.esim.api.model.EsimHyperText$Descriptor
            r6.<init>(r8, r4)
        L6a:
            if (r6 == 0) goto L20
            r3.add(r6)
            goto L20
        L70:
            java.util.List r14 = r14.getParameters()
            if (r14 == 0) goto Lad
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L81:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r14.next()
            java.lang.String r4 = (java.lang.String) r4
            dej.x0[] r8 = dej.x0.values()
            int r9 = r8.length
            r10 = r5
        L93:
            if (r10 >= r9) goto La5
            r11 = r8[r10]
            java.lang.String r12 = r11.name()
            boolean r12 = kotlin.text.a0.z(r12, r4, r7)
            if (r12 == 0) goto La2
            goto La6
        La2:
            int r10 = r10 + 1
            goto L93
        La5:
            r11 = r6
        La6:
            if (r11 == 0) goto L81
            r2.add(r11)
            goto L81
        Lac:
            r6 = r2
        Lad:
            if (r6 != 0) goto Lb1
            zhm.f0 r6 = zhm.f0.f322471a
        Lb1:
            com.revolut.retail.feature.esim.api.model.EsimHyperText r14 = new com.revolut.retail.feature.esim.api.model.EsimHyperText
            r14.<init>(r1, r3, r6)
            com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule r1 = new com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule
            r1.<init>(r0, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ofj.k.f(kfj.w1):com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingPreferredSchedule");
    }

    public static final EsimPhoneNumberPortingScheduleOption g(y1 y1Var) {
        ArrayList arrayList;
        z0 z0Var;
        Intrinsics.checkNotNullParameter(y1Var, "<this>");
        String type = y1Var.getType();
        z0[] z0VarArrValues = z0.values();
        int length = z0VarArrValues.length;
        int i = 0;
        while (true) {
            arrayList = null;
            if (i >= length) {
                z0Var = null;
                break;
            }
            z0Var = z0VarArrValues[i];
            if (a0.z(z0Var.name(), type, true)) {
                break;
            }
            i++;
        }
        if (z0Var == null) {
            z0Var = z0.UNKNOWN;
        }
        z0 z0Var2 = z0Var;
        String text = y1Var.getText();
        String subtitle = y1Var.getSubtitle();
        String minPermittedOffsetDate = y1Var.getMinPermittedOffsetDate();
        LocalDate localDate = minPermittedOffsetDate != null ? LocalDate.parse(minPermittedOffsetDate) : null;
        Long maxPermittedOffsetDays = y1Var.getMaxPermittedOffsetDays();
        List excludedDates = y1Var.getExcludedDates();
        if (excludedDates != null) {
            List list = excludedDates;
            arrayList = new ArrayList(w.t(list, 10));
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(LocalDate.parse((String) it8.next()));
            }
        }
        return new EsimPhoneNumberPortingScheduleOption(z0Var2, text, subtitle, localDate, maxPermittedOffsetDays, arrayList);
    }

    public static final EsimPhoneNumberSelectionsFee h(e2 e2Var) {
        Intrinsics.checkNotNullParameter(e2Var, "<this>");
        dj0.d dVarO = mo3.a.o(e2Var.getAmount());
        String period = e2Var.getPeriod();
        Period period2 = period != null ? Period.parse(period) : null;
        kfj.t0 highestPointsOption = e2Var.getHighestPointsOption();
        return new EsimPhoneNumberSelectionsFee(dVarO, period2, highestPointsOption != null ? ksj.b.y(highestPointsOption) : null);
    }

    public static final ArrayList i(List list) {
        EsimFeaturedPhoneNumberOption esimFeaturedPhoneNumberOption;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<d2> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (d2 d2Var : list2) {
            Intrinsics.checkNotNullParameter(d2Var, "<this>");
            List mobilePlanIds = d2Var.getMobilePlanIds();
            c2 options = d2Var.getOptions();
            Intrinsics.checkNotNullParameter(options, "<this>");
            n1 porting = options.getPorting();
            EsimPhoneNumberSelectionsLimits esimPhoneNumberSelectionsLimits = null;
            EsimPhoneNumberPorting esimPhoneNumberPortingA = porting != null ? a(porting) : null;
            EsimRandomPhoneNumberOption esimRandomPhoneNumberOption = options.getRandom() != null ? EsimRandomPhoneNumberOption.f100458a : null;
            kfj.w featured = options.getFeatured();
            if (featured != null) {
                Intrinsics.checkNotNullParameter(featured, "<this>");
                List<x> tiers = featured.getTiers();
                ArrayList arrayList2 = new ArrayList(w.t(tiers, 10));
                for (x xVar : tiers) {
                    Intrinsics.checkNotNullParameter(xVar, "<this>");
                    long rank = xVar.getRank();
                    String code = xVar.getCode();
                    String name = xVar.getName();
                    e2 fee2 = xVar.getFee();
                    arrayList2.add(new EsimFeaturedPhoneNumberTiers(rank, code, name, fee2 != null ? h(fee2) : null));
                }
                esimFeaturedPhoneNumberOption = new EsimFeaturedPhoneNumberOption(arrayList2);
            } else {
                esimFeaturedPhoneNumberOption = null;
            }
            e2 fee3 = options.getFee();
            EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFeeH = fee3 != null ? h(fee3) : null;
            f2 limits = options.getLimits();
            if (limits != null) {
                Intrinsics.checkNotNullParameter(limits, "<this>");
                esimPhoneNumberSelectionsLimits = new EsimPhoneNumberSelectionsLimits(limits.getVoiceSeconds(), limits.getSmsCount());
            }
            arrayList.add(new EsimPhoneNumberSelections(mobilePlanIds, new EsimPhoneNumberSelectionOptions(esimPhoneNumberPortingA, esimRandomPhoneNumberOption, esimFeaturedPhoneNumberOption, esimPhoneNumberSelectionsFeeH, esimPhoneNumberSelectionsLimits)));
        }
        return arrayList;
    }

    public static final j1 j(EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingAttribute, "<this>");
        String str = esimPhoneNumberPortingAttribute.f100338a;
        String str2 = esimPhoneNumberPortingAttribute.f100339b;
        String str3 = esimPhoneNumberPortingAttribute.f100340c;
        EsimHyperText esimHyperText = esimPhoneNumberPortingAttribute.d;
        e0 e0VarA = esimHyperText != null ? f.a(esimHyperText) : null;
        String strName = esimPhoneNumberPortingAttribute.e.name();
        String str4 = esimPhoneNumberPortingAttribute.f;
        EsimPhoneNumberPortingAttributesValidation esimPhoneNumberPortingAttributesValidation = esimPhoneNumberPortingAttribute.f100341g;
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingAttributesValidation, "<this>");
        Long l2 = esimPhoneNumberPortingAttributesValidation.f100343b;
        return new j1(str, str2, str3, e0VarA, strName, str4, new k1(esimPhoneNumberPortingAttributesValidation.f100344c, esimPhoneNumberPortingAttributesValidation.d, esimPhoneNumberPortingAttributesValidation.f100342a, l2));
    }

    public static final l1 k(EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingContractType, "<this>");
        String str = esimPhoneNumberPortingContractType.f100345a;
        String str2 = esimPhoneNumberPortingContractType.f100346b;
        String str3 = esimPhoneNumberPortingContractType.f100347c;
        ArrayList arrayList2 = esimPhoneNumberPortingContractType.d;
        ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            arrayList3.add(n((EsimPhoneNumberPortingScheduleOption) it8.next()));
        }
        List list = esimPhoneNumberPortingContractType.e;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                arrayList.add(j((EsimPhoneNumberPortingAttribute) it9.next()));
            }
        } else {
            arrayList = null;
        }
        return new l1(str, str2, str3, arrayList3, arrayList);
    }

    public static final s1 l(EsimPhoneNumberPortingOwnerAccountType esimPhoneNumberPortingOwnerAccountType) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingOwnerAccountType, "<this>");
        String strName = esimPhoneNumberPortingOwnerAccountType.f100367a.name();
        List list = esimPhoneNumberPortingOwnerAccountType.f100368b;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(j((EsimPhoneNumberPortingAttribute) it8.next()));
            }
        } else {
            arrayList = null;
        }
        return new s1(strName, arrayList);
    }

    public static final w1 m(EsimPhoneNumberPortingPreferredSchedule esimPhoneNumberPortingPreferredSchedule) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingPreferredSchedule, "<this>");
        return new w1(esimPhoneNumberPortingPreferredSchedule.f100381a, f.a(esimPhoneNumberPortingPreferredSchedule.f100382b));
    }

    public static final y1 n(EsimPhoneNumberPortingScheduleOption esimPhoneNumberPortingScheduleOption) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingScheduleOption, "<this>");
        String strName = esimPhoneNumberPortingScheduleOption.f100394a.name();
        String str = esimPhoneNumberPortingScheduleOption.f100395b;
        String str2 = esimPhoneNumberPortingScheduleOption.f100396c;
        LocalDate localDate = esimPhoneNumberPortingScheduleOption.d;
        ArrayList arrayList = null;
        String string = localDate != null ? localDate.toString() : null;
        Long l2 = esimPhoneNumberPortingScheduleOption.e;
        List list = esimPhoneNumberPortingScheduleOption.f;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                String string2 = ((LocalDate) it8.next()).toString();
                Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList.add(string2);
            }
        }
        return new y1(strName, str, str2, string, l2, arrayList);
    }

    public static final e2 o(EsimPhoneNumberSelectionsFee esimPhoneNumberSelectionsFee) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberSelectionsFee, "<this>");
        jo3.a aVarP = mo3.a.p(esimPhoneNumberSelectionsFee.f100409a);
        Period period = esimPhoneNumberSelectionsFee.f100410b;
        String string = period != null ? period.toString() : null;
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = esimPhoneNumberSelectionsFee.f100411c;
        return new e2(string, aVarP, esimMobilePlanPointsOption != null ? ksj.b.K(esimMobilePlanPointsOption) : null);
    }
}
