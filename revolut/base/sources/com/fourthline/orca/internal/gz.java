package com.fourthline.orca.internal;

import com.fourthline.orca.internal.az;
import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class gz implements j20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v10 f29076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ez f29077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final az.a f29078c;
    private final az d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[yk.values().length];
            try {
                iArr[yk.f35367a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yk.f35368b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public gz(v10 imageServiceLocator, ez repository) {
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f29076a = imageServiceLocator;
        this.f29077b = repository;
        yk ykVar = yk.f35367a;
        c81.a aVar = c81.f27404a;
        az.a aVar2 = new az.a(ykVar, c81.a.a(aVar, R.string.step_document_verification_type_verification_type_id_document, 0, 2, null), c81.a.a(aVar, R.string.step_document_verification_type_verification_type_id_document_description, 0, 2, null), null, false, false, 32, null);
        this.f29078c = aVar2;
        this.d = new az(c81.a.a(aVar, R.string.step_document_verification_type_header, 0, 2, null), c81.a.a(aVar, R.string.step_document_verification_type_label_type, 0, 2, null), new m80.b(false, false), new c81.d(R.string.shared_button_back, R.string.shared_button_back_accessibility), zhm.v.k(k(), aVar2));
    }

    private final az.a k() {
        yk ykVar = yk.f35368b;
        c81.a aVar = c81.f27404a;
        return new az.a(ykVar, c81.a.a(aVar, R.string.step_document_verification_type_verification_type_eid, 0, 2, null), c81.a.a(aVar, R.string.step_document_verification_type_verification_type_eid_description_germany, 0, 2, null), this.f29076a.a(r10.Y0), false, this.f29077b.b());
    }

    public final Function1 a(yk ykVar, boolean z) {
        return new em1(ykVar, this, z, 1);
    }

    @Override // com.fourthline.orca.internal.j20
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public az getInitialState() {
        return this.d;
    }

    public static /* synthetic */ Function1 a(gz gzVar, yk ykVar, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            ykVar = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return gzVar.a(ykVar, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final az a(yk ykVar, gz gzVar, boolean z, az azVar) {
        List listK;
        Intrinsics.checkNotNullParameter(azVar, "<this>");
        int i = ykVar == null ? -1 : a.$EnumSwitchMapping$0[ykVar.ordinal()];
        boolean z3 = true;
        if (i == -1) {
            listK = zhm.v.k(gzVar.k(), gzVar.f29078c);
        } else if (i == 1) {
            listK = zhm.v.k(gzVar.k(), az.a.a(gzVar.f29078c, null, null, null, null, true, false, 47, null));
        } else if (i == 2) {
            if (!gzVar.f29077b.b()) {
                listK = zhm.v.k(gzVar.k(), az.a.a(gzVar.f29078c, null, null, null, null, true, false, 47, null));
            } else {
                listK = zhm.v.k(az.a.a(gzVar.k(), null, null, null, null, true, false, 47, null), gzVar.f29078c);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        List list = listK;
        m80.b bVarO = azVar.o();
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                az.a aVar = (az.a) it8.next();
                if (aVar.f() && aVar.e()) {
                    if (z) {
                        break;
                    }
                }
            }
        } else {
            z3 = false;
        }
        return az.a(azVar, null, null, bVarO.a(z3, z), null, list, 11, null);
    }
}
