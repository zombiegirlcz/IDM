package com.fourthline.orca.internal;

import com.fourthline.orca.internal.z10;
import com.fourthline.sdk.assets.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class x10 implements v10 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[r10.values().length];
            try {
                iArr[r10.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r10.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r10.f32578g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[r10.f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[r10.i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[r10.f32579h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[r10.k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[r10.f32581j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[r10.f32584m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[r10.f32583l.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[r10.o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[r10.f32585n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[r10.f32588p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[r10.f32589q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[r10.f32590r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[r10.f32592s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[r10.f32594t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[r10.u.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[r10.v.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[r10.f32597w.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[r10.f32599x.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[r10.f32601y.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[r10.z.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[r10.A.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[r10.B.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[r10.C.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[r10.D.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[r10.E.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[r10.F.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[r10.G.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[r10.H.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[r10.I.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[r10.J.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[r10.K.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[r10.L.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[r10.M.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[r10.N.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[r10.O.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[r10.P.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[r10.Q.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[r10.R.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[r10.S.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[r10.T.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[r10.U.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[r10.V.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[r10.W.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[r10.X.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[r10.g0.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[r10.f32580h0.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[r10.i0.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[r10.j0.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[r10.f32582k0.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[r10.l0.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[r10.Y.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[r10.Z.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[r10.f32571a0.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[r10.f32572b0.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[r10.c0.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[r10.f32576d0.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[r10.f32577e0.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[r10.f0.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[r10.m0.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[r10.f32586n0.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[r10.f32587o0.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[r10.p0.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[r10.f32591r0.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[r10.f32593s0.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[r10.f32595t0.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[r10.u0.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[r10.f32596v0.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[r10.f32598w0.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[r10.f32600x0.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[r10.y0.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[r10.z0.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[r10.A0.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[r10.B0.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[r10.C0.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[r10.D0.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[r10.E0.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[r10.F0.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[r10.G0.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[r10.I0.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[r10.H0.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[r10.J0.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[r10.W0.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[r10.X0.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[r10.Y0.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[r10.Z0.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[r10.a1.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[r10.L0.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[r10.M0.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[r10.N0.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[r10.O0.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[r10.P0.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[r10.Q0.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[r10.R0.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[r10.S0.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[r10.T0.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[r10.U0.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[r10.V0.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[r10.K0.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[r10.q0.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.fourthline.orca.internal.v10
    public z10 a(r10 key) {
        int i;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            switch (a.$EnumSwitchMapping$0[key.ordinal()]) {
                case 1:
                    i = R.drawable.ic_security_features;
                    break;
                case 2:
                    i = R.drawable.can_hint;
                    break;
                case 3:
                    i = R.drawable.ic_instruction_ready;
                    break;
                case 4:
                    i = R.drawable.ic_instruction_ready_passport;
                    break;
                case 5:
                    i = R.drawable.ic_instruction_start;
                    break;
                case 6:
                    i = R.drawable.ic_instruction_start_passport;
                    break;
                case 7:
                    i = R.drawable.ic_instruction_hold;
                    break;
                case 8:
                    i = R.drawable.ic_instruction_hold_passport;
                    break;
                case 9:
                    i = R.drawable.ic_instruction_no_connection;
                    break;
                case 10:
                    i = R.drawable.ic_instruction_no_connection_passport;
                    break;
                case 11:
                    i = R.drawable.ic_instruction_complete;
                    break;
                case 12:
                    i = R.drawable.ic_instruction_complete_passport;
                    break;
                case 13:
                    i = R.drawable.document_version_fra_french_id_card_default;
                    break;
                case 14:
                    i = R.drawable.document_version_fra_id_card_15032021;
                    break;
                case 15:
                    i = R.drawable.document_version_rou_romanian_id_card_default;
                    break;
                case 16:
                    i = R.drawable.document_version_rou_romanian_id_card_02082021;
                    break;
                case 17:
                    i = R.drawable.document_mask_passport_front_tilted;
                    break;
                case 18:
                    i = R.drawable.document_mask_overlay_passport_front_tilted;
                    break;
                case 19:
                    i = R.drawable.document_mask_overlay_passport_front_tilted_success;
                    break;
                case 20:
                    i = R.drawable.document_mask_passport_front;
                    break;
                case 21:
                    i = R.drawable.document_mask_overlay_passport_front;
                    break;
                case 22:
                    i = R.drawable.document_mask_overlay_passport_front_success;
                    break;
                case 23:
                    i = R.drawable.document_mask_passport_back_qr;
                    break;
                case 24:
                    i = R.drawable.document_mask_overlay_passport_back_qr;
                    break;
                case 25:
                    i = R.drawable.document_mask_overlay_passport_back_qr_success;
                    break;
                case 26:
                    i = R.drawable.document_mask_driver_license_front_tilted;
                    break;
                case 27:
                    i = R.drawable.document_mask_overlay_driver_license_tilted;
                    break;
                case 28:
                    i = R.drawable.document_mask_overlay_driver_license_tilted_success;
                    break;
                case 29:
                    i = R.drawable.document_mask_driver_license_front;
                    break;
                case 30:
                    i = R.drawable.document_mask_overlay_driver_license;
                    break;
                case 31:
                    i = R.drawable.document_mask_overlay_driver_license_success;
                    break;
                case 32:
                    i = R.drawable.document_mask_driver_license_back_tilted;
                    break;
                case 33:
                    i = R.drawable.document_mask_driver_license_back;
                    break;
                case 34:
                    i = R.drawable.document_mask_dutch_driver_license_front_tilted;
                    break;
                case 35:
                    i = R.drawable.document_mask_dutch_driver_license_front;
                    break;
                case 36:
                    i = R.drawable.document_mask_overlay_dutch_driver_license;
                    break;
                case 37:
                    i = R.drawable.document_mask_overlay_dutch_driver_license_tilted;
                    break;
                case 38:
                    i = R.drawable.document_mask_overlay_dutch_driver_license_success;
                    break;
                case 39:
                    i = R.drawable.document_mask_overlay_dutch_driver_license_tilted_success;
                    break;
                case 40:
                    i = R.drawable.document_mask_id_card_front_tilted;
                    break;
                case 41:
                    i = R.drawable.document_mask_overlay_id_card_tilted;
                    break;
                case 42:
                    i = R.drawable.document_mask_overlay_id_card_tilted_success;
                    break;
                case 43:
                    i = R.drawable.document_mask_id_card_front;
                    break;
                case 44:
                    i = R.drawable.document_mask_overlay_id_card;
                    break;
                case 45:
                    i = R.drawable.document_mask_overlay_id_card_success;
                    break;
                case 46:
                    i = R.drawable.document_mask_id_card_back_tilted;
                    break;
                case 47:
                    i = R.drawable.document_mask_id_card_back;
                    break;
                case 48:
                    i = R.drawable.document_mask_paper_id_all_sides;
                    break;
                case 49:
                    i = R.drawable.document_mask_overlay_paper_id_all_sides;
                    break;
                case 50:
                    i = R.drawable.document_mask_overlay_paper_id_all_sides_success;
                    break;
                case 51:
                    i = R.drawable.document_mask_paper_id_inside_right_tilted;
                    break;
                case 52:
                    i = R.drawable.document_mask_overlay_paper_id_inside_right_tilted;
                    break;
                case 53:
                    i = R.drawable.document_mask_overlay_paper_id_inside_right_tilted_success;
                    break;
                case 54:
                    i = R.drawable.document_mask_french_id_front_tilted;
                    break;
                case 55:
                    i = R.drawable.document_mask_overlay_french_id_tilted;
                    break;
                case 56:
                    i = R.drawable.document_mask_overlay_french_id_tilted_success;
                    break;
                case 57:
                    i = R.drawable.document_mask_french_id_front;
                    break;
                case 58:
                    i = R.drawable.document_mask_overlay_french_id;
                    break;
                case 59:
                    i = R.drawable.document_mask_overlay_french_id_success;
                    break;
                case 60:
                    i = R.drawable.document_mask_french_id_back_tilted;
                    break;
                case 61:
                    i = R.drawable.document_mask_french_id_back;
                    break;
                case 62:
                    i = R.drawable.ic_shutter_default;
                    break;
                case 63:
                    i = R.drawable.ic_shutter_pressed;
                    break;
                case 64:
                    i = R.drawable.selfie_mask;
                    break;
                case 65:
                    i = R.drawable.selfie_mask_corners;
                    break;
                case 66:
                    i = R.drawable.liveness_mask_circle;
                    break;
                case 67:
                    i = R.drawable.liveness_mask_punchhole;
                    break;
                case 68:
                    i = R.drawable.liveness_grades_base;
                    break;
                case 69:
                    i = R.drawable.liveness_grades_long;
                    break;
                case 70:
                    i = R.drawable.liveness_grades_short;
                    break;
                case 71:
                    i = R.drawable.eid_can_hint;
                    break;
                case 72:
                    i = R.drawable.ic_passport;
                    break;
                case 73:
                    i = R.drawable.ic_national_id_card;
                    break;
                case 74:
                    i = R.drawable.ic_driver_license;
                    break;
                case 75:
                    i = R.drawable.ic_residence_permit;
                    break;
                case 76:
                    i = R.drawable.ic_paper_id;
                    break;
                case 77:
                    i = R.drawable.ic_question;
                    break;
                case 78:
                    i = R.drawable.orca_ic_error_popup;
                    break;
                case 79:
                    i = R.drawable.orca_ic_error;
                    break;
                case 80:
                    i = R.drawable.orca_ic_danger;
                    break;
                case 81:
                    i = R.drawable.orca_ic_check_eyes;
                    break;
                case 82:
                    i = R.drawable.orca_ic_check_sun;
                    break;
                case 83:
                    i = R.drawable.orca_ic_face;
                    break;
                case 84:
                    i = R.drawable.ic_scanner_success_checkmark;
                    break;
                case 85:
                    i = R.drawable.ic_orca_share;
                    break;
                case 86:
                    i = R.drawable.ic_orca_download;
                    break;
                case 87:
                    i = R.drawable.ic_fast;
                    break;
                case 88:
                    i = R.drawable.ic_lock;
                    break;
                case 89:
                    i = R.drawable.ic_scan;
                    break;
                case 90:
                    i = R.drawable.orca_ic_close;
                    break;
                case 91:
                    i = R.drawable.ic_instruction_arrow;
                    break;
                case 92:
                    i = R.drawable.orca_ic_phone_code_arrow;
                    break;
                case 93:
                    i = R.drawable.orca_ic_search;
                    break;
                case 94:
                    i = R.drawable.ic_enlarge;
                    break;
                case 95:
                    i = R.drawable.orca_ic_calendar;
                    break;
                case 96:
                    i = R.drawable.ic_start_gallery;
                    break;
                case 97:
                    i = R.drawable.ic_start_scanner;
                    break;
                case 98:
                    i = R.drawable.ic_text;
                    break;
                case 99:
                    i = R.drawable.ic_covering;
                    break;
                case 100:
                    i = R.drawable.ic_corners;
                    break;
                case 101:
                    i = R.drawable.ic_qes_agreement_see_document;
                    break;
                case 102:
                    i = R.drawable.selfie_hand_movement;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return new z10.b(i, key);
        } catch (NoClassDefFoundError unused) {
            return new z10.b(0, null, 2, null);
        }
    }
}
