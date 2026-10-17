package com.youTransactor.uCube.rpc.command;

import com.youTransactor.uCube.rpc.Constants;
import com.youTransactor.uCube.rpc.Event;
import com.youTransactor.uCube.rpc.RPCCommand;
import com.youTransactor.uCube.rpc.RPCMessage;
import com.youTransactor.uCube.rpc.SecurityMode;

/* JADX INFO: loaded from: classes17.dex */
public class EventCommand extends RPCCommand {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Event f107686m;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCommand() {
        SecurityMode securityMode = SecurityMode.NONE;
        super(Constants.EVENT_COMMAND, securityMode, securityMode);
    }

    public Event getEvent() {
        return this.f107686m;
    }

    @Override // com.youTransactor.uCube.rpc.RPCCommand
    public boolean parseResponse() {
        RPCMessage rPCMessage = this.response;
        if (rPCMessage != null && rPCMessage.getData() != null) {
            try {
                byte[] data = this.response.getData();
                if (data.length < 4) {
                    return false;
                }
                byte b4 = data[3];
                if (b4 == 2) {
                    this.f107686m = Event.wait_card;
                } else if (b4 == 10) {
                    if (data.length < 7) {
                        return false;
                    }
                    byte b5 = data[6];
                    if (b5 == 1) {
                        this.f107686m = Event.online_pin;
                    } else {
                        if (b5 != 0) {
                            return false;
                        }
                        this.f107686m = Event.offline_pin;
                    }
                }
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
